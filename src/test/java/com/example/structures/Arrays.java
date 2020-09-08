package com.example.structures;

public class Arrays {


    public static void main(String[] args) {
        int[] singleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] [] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        iterativeLoop(singleArray);
        System.out.println();
        forEachLoop(singleArray);
        System.out.println();
        iterativeLoopDouble(doubleArray);
        System.out.println();
        forEachLoopDouble(doubleArray);
        System.out.println();




    }

    public static void iterativeLoop(int[] array) {

        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void forEachLoop(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void iterativeLoopDouble(int[][] array) {

        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void forEachLoopDouble(int[][] array) {
        for (int[] subArray : array) {
            for (int element : subArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}


