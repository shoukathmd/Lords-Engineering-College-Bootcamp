package com.example.demo.internship.inputoutput;

import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Consume the leftover newline
//

        // Read text
        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        // Display output
        System.out.println("You entered integer: " + number);
        System.out.println("You entered text: " + text);

        scanner.close();

    }
}
