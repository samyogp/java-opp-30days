package day04;


class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}


public class classandobjectdemo {
    public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();   // object creation

        s1.name = "Ali";
        s1.age = 20;

        s1.study();   // calling method
    }
}
}