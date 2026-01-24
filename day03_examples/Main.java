

package day03_examples;




class Car {

    String name;
    String model;
    double price;
    boolean isElectric;

    void showDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Electric: " + isElectric);
        System.out.println("----------------------");
    }
}

public class Main {   // ✅ FIXED (capital M)
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "Toyota";
        car1.model = "Corolla 2026";
        car1.price = 25000.0;
        car1.isElectric = false;

        Car car2 = new Car();
        car2.name = "Tesla";
        car2.model = "Model 3";
        car2.price = 45000.0;
        car2.isElectric = true;

        car1.showDetails();
        car2.showDetails();
    }
}
