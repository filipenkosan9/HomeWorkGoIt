package ua.goit.module4;


public class Task3 {
    public static void main(String[] args) {

        System.out.println(distance(1, 1, 5, 5));


    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }
}
