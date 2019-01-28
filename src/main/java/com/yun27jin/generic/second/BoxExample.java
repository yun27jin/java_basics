package com.yun27jin.generic.second;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setT("hello");
        String name = box.getT();

        Box<Integer> box1 = new Box<>();
        box1.setT(1);
        Integer integer = box1.getT();
    }
}
