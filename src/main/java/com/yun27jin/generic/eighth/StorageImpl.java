package com.yun27jin.generic.eighth;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StorageImpl<T> implements Storage<T> {
    private T[] array;

    public StorageImpl(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item, int index) {
        try {
            array[index] = item;
        } catch (IndexOutOfBoundsException e) {
            log.error("{}", e);
            return;
        }
    }

    @Override
    public T get(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("{}", e);
            return null;
        }
    }
}
