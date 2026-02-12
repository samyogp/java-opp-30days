package day11_inheritance;

    class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");

    }
    
}
// child class

class car extends Vehicle {
    void drive() {
        System.out.println("car is driving");
    }
}
// main class

public class VehicleDemo {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.drive();
    }
}


