package com.yun27jin.generic.third;

public class Product<T, M> {
    private T type;
    private M model;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

}