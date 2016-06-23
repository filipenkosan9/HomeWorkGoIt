package ua.goit.module5;

import static ua.goit.module5.Maximum.maxArray;
import static ua.goit.module5.Minimum.minArray;
import static ua.goit.module5.SortMinToMax.sortirovka;

public class Start {

    public static void main(String[] args) {
        int[] array = {5,6,7,8,9,2,3,4,46,3};
        System.out.println("Min. element: " + minArray(array));
        System.out.println("Max. element: " + maxArray(array));

        System.out.println("sort array :");
        for (int arri : sortirovka(array) ) {
            System.out.println(arri);
        }
    }
}




