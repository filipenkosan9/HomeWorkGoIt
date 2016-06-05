package ua.goit.module4;


public class Task2 {

    public static void main(String[] args) {

        System.out.println(farengeit(1));
        System.out.println(celsij(50));
    }
    public static double farengeit(double c) {
        double s = (9 / 5) * (c + 32);
       return s;
    }

    public static double celsij(double f) {
       double s = ((5 / 9) * (f - 32));
        return s;
    }

}
