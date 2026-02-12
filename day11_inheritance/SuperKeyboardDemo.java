package day11_inheritance;

// super keyboard examples of inheritance
// parent class
class Keyboard {
    void type() {
        System.out.println("keyboard is used for typing");

    }
}

// child class
class Cow extends Keyboard {
    void sound() {
        System.out.println("cow eats grass");


    }
}
 // main class
public class SuperKeyboardDemo {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.type();
        c.sound();

    }
}
