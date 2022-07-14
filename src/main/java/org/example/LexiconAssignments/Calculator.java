package org.example.LexiconAssignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your two numbers: ");
        int firstInput = input.nextInt();
        int secondInput = input.nextInt();

        System.out.println(firstInput + " and " + secondInput);

        int multiplication = firstInput * secondInput;
        int division = firstInput / secondInput;
        int addition = firstInput + secondInput;
        int subtraction = firstInput - secondInput;
        System.out.println(firstInput + " * " + secondInput + " = " + multiplication);
        System.out.println(firstInput + " / " + secondInput + " = " + division);
        System.out.println(firstInput + " + " + secondInput + " = " + addition);
        System.out.println(firstInput + " - " + secondInput + " = " + subtraction);

    }
}
