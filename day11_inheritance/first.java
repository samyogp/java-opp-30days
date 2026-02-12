package day11_inheritance;
 // inheritance 
// One class can use the properties and methods of another class.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


public class first {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited method from animal class
        d.bark();  // method of Dog Class
    }
    }

