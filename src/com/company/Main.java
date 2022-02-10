package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter the circumference of the circle:");

        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();

        Circle circle = new Circle();
        Circle.area(radius);
        Circle.circumference(radius);

    }
}
