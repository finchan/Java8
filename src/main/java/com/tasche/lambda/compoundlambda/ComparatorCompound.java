package com.tasche.lambda.compoundlambda;

import com.tasche.parameterization.predicate.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCompound {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"), new Apple(120, "red"), new Apple(120, "yellow"));
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        inventory.sort(Comparator.comparing((Apple apple) -> apple.getWeight())
                                                .reversed()
                                                .thenComparing(Apple::getColor)
                                                .reversed());
        System.out.println(inventory);
    }
}
