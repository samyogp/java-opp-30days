package day04;

class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }
}


public class studentdemo {
     public static void main(String[] args) {

        Student s1 = new Student();   // object
        s1.name = "Ram";
        s1.age = 21;

        Student s2 = new Student();   // another object
        s2.name = "Shyam";
        s2.age = 22;

        s1.introduce();
        s2.introduce();
    }
}

    

