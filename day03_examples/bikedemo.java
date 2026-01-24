package day03_examples;

class Bike {
    String brand;
    String model;
    double price;
    boolean isElectric;

void showDetails() {

    System.out.println("Bike Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("price: $" + price);
    System.out.println("Electric: " + isElectric);
    System.out.println("----------------------");
}
}

public class bikedemo {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.brand = "Yamaha";
        bike1.model = "FZ-s v3";
        bike1.price = 120000.0;
        bike1.isElectric = false;

        Bike bike2 = new Bike();
        bike2.brand = "TVS";
        bike2.model = "raider";
        bike2.price = 150000.0;
        bike2.isElectric = false;


        bike1.showDetails();
        bike2.showDetails();
    }
    
}
