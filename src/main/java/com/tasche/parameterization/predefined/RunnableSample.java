package com.tasche.parameterization.predefined;

public class RunnableSample {
    public static void main(String args[]) {
        //匿名类
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello");
            }
        });
        //Lambda
        Thread t2 = new Thread(() -> System.out.println("World"));

        t.start();
        t2.start();
    }
}
