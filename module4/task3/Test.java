package ua.goit.module4.task3;


public class Test {

    public static void main(String[] args)
    {
        Point point1 = new Point(5, 5);
        Point point2 = new Point(10, 10);
        System.out.println(DistanceCalculator.calculate(point1, point2));
    }
}
