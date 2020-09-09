package com.example.algorithms;

public class CloudJumping {

    public static void main(String[] args) {
        int n = 7;
        int[] c = new int[] {0, 0, 1, 0, 0, 1, 0};
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }

    static int jumpingOnClouds(int[] c) {
        //2 <= c.length <= 100
        if (c.length < 2 || c.length > 100) {
            return -1;
        }
        int jumps = 0;
        int currentPos = 0;
        for (int i = 0; i < c.length; i++) {
            //can jump on 0
            //can't jump on 1
            //check current position against index and continue
            if (currentPos > i) {
                continue;
            }
            //can jump from current cloud to current+1 OR current+2
            //try to jump +2 first
            if ((i + 2 <= c.length - 1) && (c[i + 2] == 0)) {
                currentPos = i + 2;
                jumps++;
                //try to jump +1 next
            } else if ((i + 1 <= c.length - 1) && (c[i + 1] == 0)) {
                currentPos = i + 1;
                jumps++;
            } else {
                continue;
            }
        }
        return jumps;
    }
}
