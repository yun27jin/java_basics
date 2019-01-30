package com.yun27jin.stream.b;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(integer -> sum += integer);
        System.out.println("총합: " + sum);
    }

}