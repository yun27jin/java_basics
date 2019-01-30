package com.yun27jin.stream.b;

import com.yun27jin.stream.a.Student;

import java.util.Arrays;
import java.util.List;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        studentList.stream().forEach(System.out::println);
        studentList.stream().forEach(student -> System.out.println(student.getName()));
    }
}