package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {}

    public double squareRoot(double number1) {
        double result;
        try {
            result = Math.sqrt(number1);
        } catch (Exception e) {
            logger.error("Error - " + e);
        }
        return result;
    }

    public double factorial(double number1) {
        if (number1 == 0) return 1;
        if (number1 < 0) return -1;
        return number1 * factorial(number1 - 1);
    }


    public double naturalLog(double number1) {
        double result;
        try {
            result = Math.log(number1);
        } catch (ArithmeticException e) {
            logger.error("Error - " + e);
        }
        return result;
    }

    public double power(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Ameya's Calculator -");
            System.out.print("Press 1 for Square root.\nPress 2 for Factorial.\nPress 3 for Natural log.\nPress 4 for Power function.\n" +
                    "Press any other non-numerical key to exit the calculator.\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {
                System.out.print("Enter the number : ");
                number1 = scanner.nextDouble();
            } catch (InputMismatchException error) {
                logger.error("Entered input is not a number. Invalid.");
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("Square root result is : " + calculator.squareRoot(number1));
                    break;
                case 2:
                    System.out.println("Factorial result is : " + calculator.factorial(number1));
                    break;
                case 3:
                    System.out.println("Natural Log result is : " + calculator.naturalLog(number1));
                    break;
                case 4:
                    try {
                        System.out.print("Enter the power : ");
                        number2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Entered input is not a number. Invalid.");
                        return;
                    }
                    System.out.println("Power result is : " + calculator.power(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

}
