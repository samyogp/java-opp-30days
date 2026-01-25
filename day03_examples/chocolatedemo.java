package day03_examples;
class Chocolate {
    String brand;
    String flavor;
    double price;
    boolean isDark;

    void showDetails() {
        System.out.println("Chocolate Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Chocolate Price: " + price);
        System.out.println("IsDarkChocolate: " + isDark);
        System.out.println("----------------------");


    }
}




public class chocolatedemo {
    public static void main(String[] args) {
        Chocolate choco1 = new Chocolate();
        choco1.brand="strawberry";
        choco1.flavor="sweet";
        choco1.price=350.0;
        choco1.isDark=false;

        Chocolate choco2 = new Chocolate();
        choco2.brand="dairy milk";
        choco2.flavor="milk";
        choco2.price=400.0;
        choco2.isDark=true;

      choco1.showDetails();
      choco2.showDetails();
    }
    
}
