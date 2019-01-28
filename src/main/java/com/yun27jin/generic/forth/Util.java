package com.yun27jin.generic.forth;

import com.yun27jin.generic.second.Box;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }
}
