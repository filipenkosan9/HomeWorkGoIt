package ua.goit.module5;

/**
 * Created by Alex on 23.06.2016.
 */
public class Minimum {
    public static int minArray (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
