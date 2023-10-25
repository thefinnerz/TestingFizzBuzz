package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number for fizzbuzz checker: ");
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        new FizzBuzz(num);

    }
}