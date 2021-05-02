package com.lourenco;

import java.util.Scanner;

public class CalculatorLogic {
    Calculator operation;
    Scanner scanner;

    public CalculatorLogic() {
        scanner = new Scanner(System.in);
        operation = new Calculator();
    }

    public void logic() {
        while (true) {

            System.out.println("Hello! :) Chose your operator:");
            System.out.println("enter 1 to calculate half; \n" + "enter 2 to calculate the quarter; \n" + "enter 3 to calculate the double; \n" + "enter 4 to calculate the triple; \n" + "enter 5 to calculate the sum;  \n" + "enter 6 to calculate the subtraction; \n" + "enter 7 to calculate the multiplication; \n" + "enter 8 to calculate the division;");
            byte operations = scanner.nextByte();

            if (operations == 1) {
                System.out.println("\n");
                System.out.println("Fine, enter your number: ");
                byte inputn1 = scanner.nextByte();
                double r1 = operation.half(inputn1);
                System.out.println("\n");
                System.out.println("The half of " + inputn1 + " = " + r1);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 2) {
                System.out.println("\n");
                System.out.println("Fine, enter your number: ");
                byte inputn1 = scanner.nextByte();
                double r2 = operation.quarter(inputn1);
                System.out.println("\n");
                System.out.println("The quarter of " + inputn1 + " = " + r2);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 3) {
                System.out.println("\n");
                System.out.println("Fine, enter your number: ");
                byte inputn1 = scanner.nextByte();
                double r3 = operation.theDouble(inputn1);
                System.out.println("\n");
                System.out.println("The double of " + inputn1 + " = " + r3);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 4) {
                System.out.println("\n");
                System.out.println("Fine, enter your number: ");
                byte inputn1 = scanner.nextByte();
                double r4 = operation.triple(inputn1);
                System.out.println("\n");
                System.out.println("The triple of " + inputn1 + " = " + r4);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 5) {
                System.out.println("\n");
                System.out.println("Fine, enter your first number: ");
                byte inputn1 = scanner.nextByte();
                System.out.println("\n");
                System.out.println("Ok, now enter your second number: ");
                byte inputn2 = scanner.nextByte();
                System.out.println("\n");
                double r5 = operation.add(inputn1, inputn2);
                System.out.println("\n");
                System.out.println("The sum of " + inputn1 + " + " + inputn2 + " = " + r5);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 6) {
                System.out.println("\n");
                System.out.println("Fine, enter your first number: ");
                byte inputn1 = scanner.nextByte();
                System.out.println("\n");
                System.out.println("Ok, now enter your second number: ");
                byte inputn2 = scanner.nextByte();
                System.out.println("\n");
                double r6 = operation.sub(inputn1, inputn2);
                System.out.println("\n");
                System.out.println("The subtraction of " + inputn1 + " - " + inputn2 + " = " + r6);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 7) {
                System.out.println("\n");
                System.out.println("Fine, enter your first number: ");
                byte inputn1 = scanner.nextByte();
                System.out.println("\n");
                System.out.println("Ok, now enter your second number: ");
                byte inputn2 = scanner.nextByte();
                System.out.println("\n");
                double r7 = operation.mul(inputn1, inputn2);
                System.out.println("\n");
                System.out.println("The multiplication of " + inputn1 + " x " + inputn2 + " = " + r7);
                System.out.println("------------------------------------------------------------------------- \n");
            } else if (operations == 8) {
                System.out.println("\n");
                System.out.println("Fine, enter your first number: ");
                byte inputn1 = scanner.nextByte();
                System.out.println("\n");
                System.out.println("Ok, now enter your second number: ");
                byte inputn2 = scanner.nextByte();
                System.out.println("\n");
                double r8 = operation.div(inputn1, inputn2);
                System.out.println("\n");
                System.out.println("The division of " + inputn1 + " : " + inputn2 + " = " + r8);
                System.out.println("------------------------------------------------------------------------- \n");
            }

            System.out.println("Hi! Do you want to continue?");
            System.out.println("enter 1 to continue; \n" + "enter 2 to close; \n");
            byte yesNo = scanner.nextByte();
            if (yesNo == 2) {
                System.out.println("Bye!");
                System.out.println("------------------------------------------------------------------------- \n");
                System.exit(0);
            }
        }
    }
}




