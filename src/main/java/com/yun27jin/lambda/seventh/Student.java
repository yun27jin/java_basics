package com.yun27jin.lambda.seventh;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Sex sex;
    private int score;
}
