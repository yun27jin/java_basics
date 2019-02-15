package com.yun27jin.lambda2.d;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 40;
//         localVar = 41;
//         arg = 31;

        MyFunctionalInterface fi = () -> {
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar + "\n");
        };
        fi.method();
    }
}
