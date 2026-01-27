package day04;



class Car {
    String color;
    String model;

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }
}


public class main {
   
    public static void main(String[] args) {

        Car car1 = new Car();   // object created
        car1.color = "Red";
        car1.model = "Honda";

        car1.start();
    }
}

    

