package com.yun27jin.stream.d;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private Student.Sex sex;

    public enum Sex {
        MALE, FEMALE
    }

}
