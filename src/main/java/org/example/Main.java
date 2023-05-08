package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bmiCalculator();
    }

    private static void bmiCalculator() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj wagę w kg:");
        double weight = input.nextDouble();

        System.out.println("Podaj wzrost w cm:");
        double height = input.nextDouble();

        double bmi = weight / Math.pow(height, 2) * 10000;
        String bmii = String.format("%.2f", bmi);
        System.out.println("Twoje BMI wynosi: " + bmii);
    }


}