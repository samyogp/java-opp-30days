package day11_inheritance;

    class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");

    }
    
}

class car extends Vehicle {
    void drive() {
        System.out.println("car is driving");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.drive();
    }
}


