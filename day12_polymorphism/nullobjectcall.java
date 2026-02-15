package day12_polymorphism;


class Animal {
    void sound() {
        System.out.println("Sound");
    }
}

public class nullobjectcall {
    public static void main(String[] args) {
        Animal a = null;
        a.sound();
    }
}
