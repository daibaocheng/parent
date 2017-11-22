package com.vankeytech.pmp.auth.util.compact;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;

public class CompactObjectInputStream extends ObjectInputStream {
    private final ClassResolver classResolver;

    public CompactObjectInputStream(InputStream in, ClassResolver classResolver) throws IOException {
        super(in);
        this.classResolver = classResolver;
    }

    @Override
    protected void readStreamHeader() throws IOException {
        int version = readByte() & 0xFF;
        if (version != 5) {
            throw new StreamCorruptedException("Unsupported version: " + version);
        }
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        int type = read();
        if (type < 0) {
            throw new EOFException();
        }
        switch (type) {
            case 0:
                return super.readClassDescriptor();
            case 1:
                String className = readUTF();
                Class<?> clazz = this.classResolver.resolve(className);
                return ObjectStreamClass.lookupAny(clazz);
        }
        throw new StreamCorruptedException("Unexpected class descriptor type: " + type);
    }

    @Override
    protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
        Class<?> clazz;
        try {
            clazz = this.classResolver.resolve(desc.getName());
        } catch (ClassNotFoundException ignored) {
            clazz = super.resolveClass(desc);
        }

        return clazz;
    }
}