package com.tasche.lambda.predefined;

import com.tasche.parameterization.predicate.Predicate;

import java.util.function.IntPredicate;

public class BoxingUnBoxingSample {
    public static void main(String[] args) {
        IntPredicate evenNumber = (int i) -> i%2==0;
        //不用装箱
        evenNumber.test(10);
        Predicate<Integer> oddNumber = (Integer i) -> i%2==1;
        //需要装箱
        oddNumber.test(100);
    }
}
