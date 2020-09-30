package com.tasche.parameterization.predicate;

import java.util.List;

public class ApplePrintFormatting {

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for(Apple apple: inventory) {
            String format = formatter.accept(apple);
            System.out.println(format);
        }
    }

    public static void main(String[] args){

    }
}
