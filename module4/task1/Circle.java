package ua.goit.module4.task1;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculator() {
        return r * Math.PI;
    }
}
