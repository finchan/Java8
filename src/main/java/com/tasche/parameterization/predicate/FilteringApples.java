package com.tasche.parameterization.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
    //实现根据抽象条件筛选，使得方法的行为参数化
    //这种实现不仅仅是通过谓词（True/False）作为返回，
    //它可以根据我们定义的实现抽象的类的含义来做特殊化处理
    //参见其他例子- ApplePrintFormatter
    //这种行为参数化应该放在工具箱里，用来编写灵活的API
    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    //更加深入的抽象（泛型）
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList();
        for(T t: list) {
            if(p.test(t)) {
                result.add(t);
            };
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"), new Apple(120, "red"));

        List<Apple> greenApples = filterApples(inventory,new AppleColorPredicate());
        System.out.println(greenApples);

        List<Apple> heavyApples = filterApples(inventory, new AppleWeightPredicate());
        System.out.println(heavyApples);

        List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
        System.out.println(redAndHeavyApples);
        //使用匿名类
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        //Lambda表达式
        List<Apple> result = filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println(result);
        System.out.println(redApples);

        List<Apple> genericRedApples = filter(inventory, (Apple apple) ->"red".equals(apple.getColor()));
        System.out.println(genericRedApples);
        List<Integer> genericIntegersFilter = filter(Arrays.asList(1, 2, 3,4, 5), (Integer i) -> i%2==0);
        System.out.println(genericIntegersFilter);
    }
}
