package day12_polymorphism.CompileTimePolymorphism;

class Student {
    Student() {
        System.out.println("Default Constructor");

    }
    Student(String name) {
        System.out.println("Name: " + name);

    }
}


public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Samyog");
    }

    
}

