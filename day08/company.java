package day08;

// Base class: Employee
class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class: Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    void displayManagerInfo() {
        displayInfo(); // call parent method
        System.out.println("Team Size: " + teamSize);
    }
}

// Derived class: Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloperInfo() {
        displayInfo(); // call parent method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class
public class company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 28, 50000);
        Manager mgr1 = new Manager("Bob", 40, 80000, 5);
        Developer dev1 = new Developer("Charlie", 30, 60000, "Java");

        System.out.println("----- Employee -----");
        emp1.displayInfo();

        System.out.println("\n----- Manager -----");
        mgr1.displayManagerInfo();

        System.out.println("\n----- Developer -----");
        dev1.displayDeveloperInfo();
    }
}
