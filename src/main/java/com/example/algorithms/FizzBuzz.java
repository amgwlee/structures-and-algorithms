package com.example.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        fizzBuzz(n);
        bufferedReader.close();
    }

/*
 * The function accepts INTEGER n as parameter.
 * 0 < n < 200000
 */
    public static void fizzBuzz(int n) {
        //constraint check
        if (n < 1 || n > 200000) {
            return;
        }
        //loop through integer from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            //if n is a multiple of both
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            //if n is a multiple of just 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            //if n is a multiple of just 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            //if n is not a multiple 3 or 5
            else {
                System.out.println(i);
            }
        }
    }
}