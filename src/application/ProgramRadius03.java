package application;

import util.Calculator02;

import java.util.Scanner;

public class ProgramRadius03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator02.circumference(radius);
        double v = Calculator02.volume(radius);


        System.out.printf("Cimcurference = %.2f%n", c);
        System.out.printf("Volume = %.2f%n", v);
        System.out.printf("PI = %.2f%n", Calculator02.PI);


        sc.close();
    }
}