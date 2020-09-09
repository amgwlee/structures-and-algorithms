package com.example.algorithms;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "aba";
        long n = 10;
        long result = repeatedString(s, n);
        System.out.println(result);

        String s2 = "a";
        long n2 = 1000000;
        long result2 = repeatedString(s2, n2);
        System.out.println(result2);

        String s3 = "abcdefghij";
        long n3 = 3;
        long result3 = repeatedString(s3, n3);
        System.out.println(result3);
    }

    //Given an integer, n, find the number of letter a's in the first n letters of an infinitely repeated string.
    static long repeatedString(String s, long n) {
        long result = 0;

        long numOfStrings = n / s.length();
        long remainderString = n % s.length();

        if(!s.contains("a"))
            return result;

        if (s.length() > n) {
            result = aCounter(s, remainderString);
        } else {
            result = numOfStrings * aCounter(s, s.length()) + aCounter(s, remainderString);
        }
        return result;
    }

    private static long aCounter(String s, long end) {
        int a = 0;
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == 'a')
                a++;
        }
        return a;
    }
}


