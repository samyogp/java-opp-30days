package day05;
import java.util.Scanner;   // This lets Java take input from the user

public class multiplynumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create input tool

        System.out.print("Enter first number: ");
        int a = input.nextInt();   // Store first number

        System.out.print("Enter second number: ");
        int b = input.nextInt();   // Store second number

        int result = a * b;        // Multiply the numbers

        System.out.println("Answer is: " + result); // Show result
    }
}
