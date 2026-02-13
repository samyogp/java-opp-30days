package day11_inheritance;


// constructor inheritance example
// parent class
/* class Person {
    Person() {
        System.out.println("person constructor");
    }
}
// child class
class Student extends Person {
    Student() {
        System.out.println("student constructor");


    }
} */
  // parent class
    class Man {
        Man() {
            System.out.println("Man Constructor");
        }
    }
    // child class
    class Boy extends Man {
        Boy() {
            super(); // calling parent constructor
            System.out.println("Boy Constructor");
        }
    }
/* public class ConstructorInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("constructor inheritance example");
        


    } */
   // main class
        public class ConstructorInheritance {
            public static void main(String[] args) {
                Boy b = new Boy();
                System.out.println("constructor inheritance example");
            }
    
}
