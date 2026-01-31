package day04;

class Car {
    String color;
    String model;

    void start() {
        System.out.println(model + " car is starting");
    }

    void stop() {
        System.out.println(model + " car is stopping");
    }
}
public class superdemo {

    public static void main(String[] args) {

        Car car1 = new Car();   // object created
        car1.color = "Red";
        car1.model = "Honda";

        car1.start();
        car1.stop();
    }
}
