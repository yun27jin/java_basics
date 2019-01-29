package com.yun27jin.lambda.tenth;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        IntPredicate predicateA = a -> a % 2 == 0;
        IntPredicate predicateB = a -> a % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9 는 2 와 3 의 배수입니까? " + result);

        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9 는 2 또는 3 의 배수입니까? " + result);

        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9 는 홀수입니까? " + result);
    }
}
