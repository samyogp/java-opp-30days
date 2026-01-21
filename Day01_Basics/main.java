// Day01_Basics/Main.java //
package Day01_Basics;
public class main {
    public static void main(String[] args) {

        // 1️⃣ Print a welcome message //
        System.out.println("Welcome to Java OOP 30 Days Journey!");

        // 2️⃣ Variables
        int age = 20;                 // integer
        double height = 5.9;          // decimal number
        char grade = 'A';             // single character
        boolean isStudent = true;     // true/false
        String name = "Samyog";       // text

        // 3️⃣ Print variable values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student? " + isStudent);

        // 4️⃣ Simple arithmetic
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = (double)a / b;

        System.out.println("\nSimple Arithmetic:");
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + division);
    }

}
