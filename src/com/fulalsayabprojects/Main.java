package com.fulalsayabprojects;

// Read and print the sum of 10 numbers from the console

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter < 11) {
            System.out.println("Enter number #" + counter);
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid Number");

            }
            scanner.nextLine();

        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }

}
