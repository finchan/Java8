package com.tasche.lambda.compoundlambda;

import java.util.function.Function;

public class Letter {
    public static String addHeader(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }

    public static String addFooter(String text) {
        return text + " Kind regards. labda!";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "Lambda");
    }

    public static void main(String[] args) {
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> pipeLine
                = addHeader
                                .andThen(Letter::checkSpelling)
                                .andThen(Letter::addFooter)
                                .andThen(Letter::checkSpelling);
        System.out.println(pipeLine.apply("Hello, labda"));
    }
}
