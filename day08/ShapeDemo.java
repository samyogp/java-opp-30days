package day08;

// Base class
class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Derived class: Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(String color, double radius) {
        super(color); // call parent constructor
        this.radius = radius;
    }

    double area() {
        return 3.14159 * radius * radius;
    }

    void displayCircle() {
        displayColor(); // call parent method
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area());
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    void displayRectangle() {
        displayColor();
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area());
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red", 5.0);
        Rectangle r1 = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("----- Circle -----");
        c1.displayCircle();

        System.out.println("\n----- Rectangle -----");
        r1.displayRectangle();
    }
}
