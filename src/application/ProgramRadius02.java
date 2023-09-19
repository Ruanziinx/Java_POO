package application;

import util.Calculator;

import java.util.Scanner;

public class ProgramRadius02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        //double c = calc.circumference(radius);
        double v = calc.volume(radius);


        System.out.printf("Cimcurference = %.2f%n", calc.circumference(radius));
        System.out.printf("Volume = %.2f%n", v);
        System.out.printf("PI = %.2f%n", calc.PI);


        sc.close();
    }
}

