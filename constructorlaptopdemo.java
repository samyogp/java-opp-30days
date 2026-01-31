

class Laptop {
    String brand;
    int ram;

    Laptop(String b, int r) {
        brand = b;
        ram = r;
    }

    void specs() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB");
    }
}






public class constructorlaptopdemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16);
        l1.specs();
    }
}

    

