package application;

import entities.Employee;

import java.util.Scanner;

public class ProgramSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println(" ");
        System.out.println(employee);
        System.out.println(" ");

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println(" ");
        System.out.println("Update data: " + employee);

        sc.close();
    }
}
