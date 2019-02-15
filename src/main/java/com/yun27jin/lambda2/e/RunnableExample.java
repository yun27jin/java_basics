package com.yun27jin.lambda2.e;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
