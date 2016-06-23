package ua.goit.module5;

public class SortMinToMax {
    public static int[] sortirovka(int[] array){
        boolean bool = true;
        while (bool){
            bool = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                bool = true;
                }
            }
        }
        return array;
    }
}
