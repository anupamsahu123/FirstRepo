package oopsJavaPart1;

abstract class Quadrilaterall {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilaterall(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1 + side2 + side3 + side4);
    }
}

class Rectanglee extends Quadrilaterall {

    Rectanglee(int length, int breadth) {
        super(length, breadth, length, breadth);
    }

    public double getArea() {
        return side1*side2;
    }
}

public class DoubtsSession {
    public static void main(String[] args) {
        Rectanglee rect = new Rectanglee(4,5);
        System.out.println("Area " + rect.getArea());
        System.out.println("Perimeter " + rect.getPerimeter());
    }
}