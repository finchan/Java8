package com.tasche.lambda.methodreference;
@FunctionalInterface
public interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}
