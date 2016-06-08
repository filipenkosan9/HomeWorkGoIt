package ua.goit.module4.task1;


public class ShapeCalculator {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println(circle.calculator());

        Shape rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.calculator());

        Shape triangle = new Triangle(5, 4);
        System.out.println(triangle.calculator());

    }
}
