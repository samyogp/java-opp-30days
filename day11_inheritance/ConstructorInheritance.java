package day11_inheritance;


// constructor inheritance example
// parent class
class Person {
    Person() {
        System.out.println("person constructor");
    }
}

// child class
class Student extends Person {
    Student() {
        System.out.println("student constructor");


    }
}


public class ConstructorInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("constructor inheritance example");
        


    }
    
}
