package com.vankeytech.pmp.auth.util.compact;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

/**
 * @author  xieliang
 */
public class CompactObjectOutputStream extends ObjectOutputStream {
    static final int TYPE_FAT_DESCRIPTOR = 0;
	static final int TYPE_THIN_DESCRIPTOR = 1;

	public CompactObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}


	@Override
	protected void writeStreamHeader() throws IOException {
		writeByte(5);
	}

	@Override
	protected void writeClassDescriptor(ObjectStreamClass desc) throws IOException {
		Class<?> clazz = desc.forClass();
		if ((clazz.isPrimitive()) || (clazz.isArray()) || (clazz.isInterface()) || (desc.getSerialVersionUID() == 0L)) {
			write(0);
			super.writeClassDescriptor(desc);
		} else {
			write(1);
			writeUTF(desc.getName());
		}
	}
}