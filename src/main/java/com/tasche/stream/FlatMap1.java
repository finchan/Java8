package com.tasche.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FlatMap1 {
    public static void main(String[] args) {
        //list1(1,2,3), list2(3,4) -> [1,3],[1,4],[2,3],[2,4], [3,3], [3,4]
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> paris = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[] {i, j}))
                .collect(Collectors.toList());

        Stream<Stream<Integer>>     ns =    numbers1.stream().map           (i-> numbers1.stream());
        Stream<Integer>                         n2 =    numbers1.stream().flatMap   (i ->numbers2.stream());
        ns.forEach( n-> n.forEach(m->System.out.println(m)) );
        n2.forEach(i -> System.out.println("--" + i));
    }
}
