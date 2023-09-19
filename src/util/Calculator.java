package entities;

public class Calculator {
    public static final double PI = 3.14;
    public double radius;


    public double circumference(){
        return 2.0 * PI * radius;
    }

    public double volume(){
        return 4 * PI * Math.pow(radius, 3) / 3.0;
    }

    public String toString(){
        return "Cimcurference = " + String.format("%.2f%n", circumference()) +
                "Volume = " + String.format("%.2f%n", volume()) +
                "PI = " + String.format("%.2f%n", PI);
    }
}
