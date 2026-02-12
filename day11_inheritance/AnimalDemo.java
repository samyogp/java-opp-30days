package day11_inheritance;

// multilevel inheritance (Grandparent class, parent class and child class)
// grandparent class
class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }
}

// parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");

    }
}

// child class

class Puppy extends Dog {
    void weep() {
        System.out.println("puppy weeps");
    }
}

// main classc
public class AnimalDemo {
    public static void main(String[] args) {
        Dog D = new Dog();
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
    
}
