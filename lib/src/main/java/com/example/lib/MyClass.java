package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(add3());
    }

    static int add3() {
        int addcount = 0;
        for (int i = 0; i <= 100; i += 2) {
            addcount += i;
        }
        return addcount;
    }
}