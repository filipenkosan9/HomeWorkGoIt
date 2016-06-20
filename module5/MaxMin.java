package ua.goit.module5;

public class MaxMin {

    public static void main(String[] args) {
        int[] array = new int[5];
        //__________________________
        array[0] = 4;
        array[1] = 12;
        array[2] = 12;
        array[3] = 3;
        array[4] = 5;
        //__________________________
        System.out.println(minArray(array));
        System.out.println(maxArray(array));
        ads(12, array);
    }
    // array[0] = 12;
//Student[] student = new Student[30];
//student[0] = new Student("Name", "LastName" , age );
//student[1] = new Student("Name1", "LastName2" , 25 );
// тип масива    ссилка на масив = new Обєкт (int[20]) на 20 елементів

    public static int minArray (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxArray (int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void ads(int a, int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
               count++;
            }

        }
        System.out.println("Find " + count + " element  " + a );
    }
}




