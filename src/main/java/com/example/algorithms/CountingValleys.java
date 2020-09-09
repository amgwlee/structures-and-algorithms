package com.example.algorithms;

public class CountingValleys {


    public static void main(String[] args) {

        int n = 12;

        String s = "DDUUDDUDUUUD";

        int valleys = countingValleys(n, s);

        int mountains = countingMountains(n, s);

        System.out.println("Hiker climbed through " + valleys + " valleys and " + mountains + " mountains.");
    }

    // Counts the number of times lvl comes back to 0 from negative
    static int countingValleys(int n, String s) {
        int valleys = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U')
                lvl++;
            if(c == 'D')
                lvl--;

            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                valleys++;
        }
        return valleys;
    }

    // Counts the number of times lvl comes back to 0 from positive
    static int countingMountains(int n, String s) {
        int mountains = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U')
                lvl++;
            if(c == 'D')
                lvl--;

            // if we just came UP to sea level
            if(lvl == 0 && c == 'D')
                mountains++;
        }
        return mountains;
    }

}
