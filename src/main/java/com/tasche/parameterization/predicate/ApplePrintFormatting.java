package com.tasche.parameterization.predicate;

import java.util.Arrays;
import java.util.List;

public class ApplePrintFormatting {
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for(Apple apple: inventory) {
            String format = formatter.accept(apple);
            System.out.println(format);
        }
    }
    public static void main(String[] args){
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"), new Apple(120, "red"));
        prettyPrintApple(inventory, new AppleSimpleFormatter());
        prettyPrintApple(inventory, (Apple apple) ->  apple.getColor() + "\t" + apple.getWeight());
    }
}
