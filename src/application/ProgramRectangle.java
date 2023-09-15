package application;

import entities.Rectangle;

import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.Height = sc.nextDouble();
        rectangle.Width = sc.nextDouble();

        System.out.println(rectangle);




        sc.close();
    }
}
