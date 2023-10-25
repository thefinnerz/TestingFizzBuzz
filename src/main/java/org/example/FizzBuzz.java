package org.example;

public class FizzBuzz {
    public FizzBuzz(String num) {
        int range = Integer.parseInt(num);
        for (int i = 1; i < range; i++) {
            System.out.println(CheckFizzBuzz(i));
        }
    }

    public static String CheckFizzBuzz(int i) {
        if ( i%5 == 0 && i%3 ==0) {
            return "FizzBuzz";
        } else if ( i%3 == 0) {
            return "Fizz";
        } else if ( i%5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
