package ua.goit.module4.task1;


public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculator() {
        return a * b;
    }
}
