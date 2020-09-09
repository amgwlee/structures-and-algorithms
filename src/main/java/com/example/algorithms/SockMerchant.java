package com.example.algorithms;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

    public static void main(String[] args) {
        int n = 10;
        int[] ar = new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int result = sockMerchant(n, ar);
        System.out.println(result + " pairs found.");
    }

    // returns how many pairs exist given an array ar of length n
    static int sockMerchant(int n, int[] ar) {
        //adding to a hashset ensures that no duplicates can be added without being
        //recognized as having found a pair
        Set<Integer> needPairs = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            //If i is not in the set, add it.
            //If i is already in the set, a pair has been found.
            //If a pair has been found, take i back out of the set.
            if (!needPairs.contains(ar[i])) {
                needPairs.add(ar[i]);
            } else {
                pairs++;
                needPairs.remove(ar[i]);
            }
        }
        return pairs;
    }
}
