package com.springboot.demo.letcode;

import java.util.Collections;

/**
 * 按序打印
 *
 * 三个不同的线程将会公用一个Foo实例。
 * 线程A将会调用one方法
 * 线程B将会调用two方法
 * 线程C将会调用three方法
 * 请设计修改程序，以确保two方法在one方法之后被执行，
 * three方法在two方法之后被执行。
 */
public class Solution1114 {
    public static void main(String[] args) {

        Foo foo = new Foo();
        Thread thread = new Thread(() -> {
            System.out.println("aaa");
            foo.first(() -> {});
        });

        thread.start();
    }
}

class Thread1 extends Thread{
    Foo foo;

    Thread1(Foo foo) {}

    @Override
    public void run() {
        foo.first(new Thread1(foo));
    }
}

class Foo {
    public void first(Runnable printFirst) {
        System.out.println("one");
        printFirst.run();
    }

    public void second(Runnable printSecond) {
        System.out.println("two");
        printSecond.run();
    }

    public void third(Runnable printThird) {
        System.out.println("three");
        printThird.run();
    }
}
