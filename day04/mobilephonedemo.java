package day04;


class Mobile {
    String brand;
    int battery;

    void charge() {
        battery = battery + 10;
        System.out.println(brand + " charged. Battery: " + battery + "%");
    }
}

public class mobilephonedemo {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.battery = 40;

        m1.charge();
    }
}
