package oopsJavaPart2;

abstract class Shape {
    abstract double perimeter();

    abstract double area();
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }

    @Override
    public double area() {
        return length*breadth;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape s = new Rectangle(5,6);

        Shape s1 = new Circle(4);

        System.out.println("Rectangle Area is " + s.area());
        System.out.println("Circle Area is " + s1.area());
    }}