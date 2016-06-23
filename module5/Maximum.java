package ua.goit.module5;

/**
 * Created by Alex on 23.06.2016.
 */
public class Maximum {

    public static int maxArray (int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
