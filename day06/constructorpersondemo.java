







class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class constructorpersondemo {


    public static void main(String[] args) {
        Person p = new Person("Bishwaraj", 25);
        p.show();
    }
}

