package application;

import java.util.Scanner;

public class ProgramRadius01 {

    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Cimcurference = %.2f%n", c);
        System.out.printf("Volume = %.2f%n", v);
        System.out.printf("PI = %.2f%n", PI);


        sc.close();
    }

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * Math.pow(radius, 3) / 3.0;
    }
}
