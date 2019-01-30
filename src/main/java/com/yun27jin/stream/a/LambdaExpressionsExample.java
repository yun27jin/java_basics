package com.yun27jin.stream.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
    /**
     * 외부 반복자(external iterator)란 개발자가 코드로 직접 컬렉션의 요소를 반복해서 가져오는 코드패턴을 말한다.
     * index 를 이용하는 for 문 그리고 Iterator 를 이용하는 while 문은 모두 외부 반복바를 이용하는 것이다.
     * 반면에 내부 반복자(internal iterator)는 컬렉션 내부에서 요소들을 반복시키고, 개발자는 요소당 처리해야 할
     * 코드만 제공하는 코드 패턴을 말한다.
     */
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신용권", 92)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(student -> {
            String name = student.getName();
            int score = student.getScore();
            System.out.println(name + "-" + score);
        });
    }

}