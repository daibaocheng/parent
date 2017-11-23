package com.vankeytech.pmp.auth.util.compact;

import java.util.Map;

public class CachingClassResolver implements ClassResolver {
    private final Map<String, Class<?>> classCache;
	private final ClassResolver delegate;

	public CachingClassResolver(ClassResolver delegate, Map<String, Class<?>> classCache) {
		this.delegate = delegate;
		this.classCache = classCache;
	}

	@Override
	public Class<?> resolve(String className) throws ClassNotFoundException {
		Class<?> clazz = (Class<?>) this.classCache.get(className);
		if (clazz != null) {
			return clazz;
		}

		clazz = this.delegate.resolve(className);

		this.classCache.put(className, clazz);
		return clazz;
	}
}