package com.company;

public class Circle {
    private static double pi = Math.PI;


    static void area(int radius) {
        System.out.println(pi*(radius * radius));
    }

    static void circumference(int radius) {
        System.out.println(pi * 3 * radius);
    }
}
