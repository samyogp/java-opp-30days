package day11_inheritance;
// method overriding example using animal in inheritance
// parent class 
class Animal {
    void eat() {
        System.out.println("Animal makes sound");
    }
}
// child class
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats meat");
    }
}

// main class

public class AnimalMethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
    
}
