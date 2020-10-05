package com.tasche.parameterization.predefined;

import com.tasche.parameterization.predicate.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"), new Apple(120, "red"));
        //匿名类（这里可以使用List自带的sort或者Collections.sort）
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                //Descending
                return o2.getColor().compareTo(o1.getColor());
                //Ascending
                //return o1.getColor().compareTo(o2.getColor());
            }
        });
        System.out.println(inventory);
        //Lambda实现 Ascending
        inventory.sort((Apple a1, Apple a2)->a1.getColor().compareTo(a2.getColor()));
        System.out.println(inventory);
    }
}
