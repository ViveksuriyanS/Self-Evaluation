package com.task;

class A1 {
    public A1() {
        System.out.print("A");
    }
}

class B extends A1 {
    public B() {
        System.out.print("B");
//        super();
    }
}

public class Try {
    public static void main(String[] args) {
        new B();
    }
}