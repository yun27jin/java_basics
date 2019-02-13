package com.yun27jin.stream.c;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student implements Comparable<Student> {
    private String name;
    private Integer score;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }

}
