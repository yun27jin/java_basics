package com.yun27jin.lambda.seventh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", Sex.MALE, 90),
            new Student("김순희", Sex.FEMALE, 90),
            new Student("김자바", Sex.MALE, 95),
            new Student("박한나", Sex.FEMALE, 92)
    );

    public static double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals(Sex.MALE));
        System.out.println("남자 평균 점수: " + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals(Sex.FEMALE));
        System.out.println("여자 평균 점수: " + femaleAvg);
    }

}