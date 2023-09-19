package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class ProgramCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        CurrencyConverter.dollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.conversioDollar());

        sc.close();
    }
}
