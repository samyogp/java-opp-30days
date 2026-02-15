package day12_polymorphism;

// Null Object Call Example 
class Animal {
    void sound() {
        System.out.println("Sound");
    }
}
    // main class to test the null object call
public class nullobjectcall {
    public static void main(String[] args) {
        Animal a = null;
        a.sound();
    }
}
