package com.sethjava;

public class ArrayDemo1 {

    public static void main(String[] args) {
	    // There are 3 ways to initialize the array
        // Method 1
        int[] myIntArray1 = new int[5];
        myIntArray1[0] = 45;
        myIntArray1[1] = 55;
        myIntArray1[2] = 65;
        myIntArray1[3] = 75;
        myIntArray1[4] = 85;

        // Method 2
        int[] myIntArray2 = {34, 44, 54, 64, 74};

        // Method 3
        int[] myIntArray3 = new int[5];
        for(int i=0; i < myIntArray3.length; i++){
            myIntArray3[i] = i*10;
        }

        System.out.println("Print the myIntArray1 elements");
        printArray(myIntArray1);

        System.out.println("Print the myIntArray2 elements");
        printArray(myIntArray2);

        System.out.println("Print the myIntArray3 elements");
        printArray(myIntArray3);
    }

    private static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
