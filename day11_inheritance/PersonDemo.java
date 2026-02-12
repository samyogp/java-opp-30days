package day11_inheritance;

// parent class of person
class Person {
    void walk() {
        System.out.println("person is walking");
    }
}

// child class of student

class Student extends Person {
    void study() {
        System.out.println("student is studying");

    }
}
// main class 
public class PersonDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.walk();
        s.study();
       
        
        
    }
}

