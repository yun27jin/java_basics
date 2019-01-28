package com.yun27jin.generic.fifth;

import java.util.Objects;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = Objects.equals(p1.getKey(), p2.getKey());
        boolean valueCompare = Objects.equals(p1.getValue(), p2.getValue());
        return keyCompare && valueCompare;
    }

}