package day11_inheritance;

class fruit {
    void taste() {
        System.out.println("fruit is sweet");

    }
}
 class Mango extends fruit {
    void Color() {
        System.out.println("mango is yellow in color");

    }
 }
public class FruitDemo {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.taste();
        m.Color();
        
    }
    
}
