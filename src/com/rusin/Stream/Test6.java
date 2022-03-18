package com.rusin.Stream;

import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
//        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
//        stream3.forEach(System.out :: println);

          Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 2, 4, 5,  5);
//          stream1.distinct().forEach(System.out :: println);
//          System.out.println(stream1.count());
        System.out.println(stream1.distinct().peek(System.out :: println).count());
    }
}
