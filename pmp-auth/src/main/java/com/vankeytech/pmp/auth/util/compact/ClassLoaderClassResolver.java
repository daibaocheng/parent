package com.vankeytech.pmp.auth.util.compact;

public class ClassLoaderClassResolver implements ClassResolver {
    private final ClassLoader classLoader;

	public ClassLoaderClassResolver(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	@Override
	public Class<?> resolve(String className) throws ClassNotFoundException {
		try {
			return this.classLoader.loadClass(className);
		} catch (ClassNotFoundException ignored) {
		}
		return Class.forName(className, false, this.classLoader);
	}
}