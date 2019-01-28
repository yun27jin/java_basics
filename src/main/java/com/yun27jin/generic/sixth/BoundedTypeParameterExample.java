package com.yun27jin.generic.sixth;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        //Util.compare("String", "string");
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(4.5, 20);
        System.out.println(result2);
    }
}
