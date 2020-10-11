package com.tasche.lambda.compoundlambda;

import java.util.function.Function;

public class FunctionCompound {
    public static void main(String[] args) {
        Function<Integer, Integer> fx = x-> x+1;
        Function<Integer, Integer> gx = x -> x*2;
        Function<Integer, Integer> gfx = fx.andThen(gx);
        Function<Integer, Integer> fgx = fx.compose(gx);
        System.out.println(gfx.apply(1));
        System.out.println(fgx.apply(1));
    }
}
