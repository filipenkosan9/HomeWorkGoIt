package ua.goit.module5;

import java.util.Scanner;


public class Task2 {

    public static final int CONST = 3;

    public static void main(String[] args) {
        double[] doubleArray = {2.2, 4.2, 6.5, 4.0, 5.0};

        boolean swapOccurred = true;

        while (swapOccurred) {
            swapOccurred = false;


            for (int i = 0; i < doubleArray.length - 1; i++) {
                if (doubleArray[i] > doubleArray[i + 1]) {
                    double tempVariable = doubleArray[i];

                    doubleArray[i] = doubleArray[i + 1];
                    doubleArray[i + 1] = tempVariable;

                    swapOccurred = true;
                }
            }
        }
        for (double element : doubleArray){
            System.out.println(element);
        }


    }
}


