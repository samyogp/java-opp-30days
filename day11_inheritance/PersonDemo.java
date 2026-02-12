package day11_inheritance;
class Person {
    void walk() {
        System.out.println("person is walking");
    }
}

class Student extends Person {
    void study() {
        System.out.println("student is studying");

    }
}
public class PersonDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.walk();
        s.study();
       
        
        
    }
}

