package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.nome = scanner.nextLine();
        System.out.println("1º grade: ");
        student.nota1 = scanner.nextDouble();
        System.out.println("2º grade: ");
        student.nota2 = scanner.nextDouble();
        System.out.println("3º grade: ");
        student.nota3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        scanner.close();
    }
}
