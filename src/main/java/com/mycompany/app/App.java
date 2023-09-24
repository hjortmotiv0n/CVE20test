package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        String ageInput = scanner.nextLine();

        scanner.close();

        // This part of the code doesn't validate the input properly, which can
        // lead to improper behavior of the program
        try {
            int age = Integer.parseInt(ageInput);
            if (age < 0) {
                System.out.println("Age cannot be negative.");
            } else {
                System.out.println("Thank you! Your age is recorded as " + age);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
                    
            
    }
}
