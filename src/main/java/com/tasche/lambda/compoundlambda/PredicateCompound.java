package com.tasche.lambda.compoundlambda;

import com.tasche.parameterization.predicate.Apple;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateCompound {
    public static void main(String[] args) {
        Predicate<Apple> redApple = (Apple apple) -> "red".equals(apple.getColor());
        Predicate<Apple> notRedApple = redApple.negate();
        Predicate<Apple> notRedAndHeavyApple = notRedApple.and((Apple apple) -> apple.getWeight() > 130);
        Predicate<Apple> redAndHeavyOrGreenApple = redApple.and((Apple apple) -> apple.getWeight() > 130)
                                                                                                    .or((Apple apple) -> "green".equals(apple.getColor()));
        Function<Apple, String> apple = Apple::getColor;
        System.out.println(apple.apply(new Apple(10, "red")));
    }
}
