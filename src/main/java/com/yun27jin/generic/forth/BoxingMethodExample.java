package com.yun27jin.generic.forth;

import com.yun27jin.generic.second.Box;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<String> name = Util.boxing("name");
        String t = name.getT();

        Box<Integer> integerBox = Util.<Integer>boxing(3);
        Integer integerBoxT = integerBox.getT();
    }
}
