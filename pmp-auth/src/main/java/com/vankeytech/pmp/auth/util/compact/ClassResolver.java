package com.vankeytech.pmp.auth.util.compact;

public interface ClassResolver {
    public abstract Class<?> resolve(String paramString) throws ClassNotFoundException;
}
