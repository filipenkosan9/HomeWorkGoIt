package ua.goit.module4;

public class Task1 {
    public static void main(String[] args) {
        double res = triangula(15,12,8);
        System.out.println(res);

        System.out.println(rectangle(12,25));
        System.out.println(circle(15));
    }

    public static double triangula(double a, double b, double c){
        double p;
        p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(s);
    }

    public static double rectangle(double a, double b){
       return a * b;
    }

    public static double circle(double r){
        return Math.PI * (r * r);
        }
}

