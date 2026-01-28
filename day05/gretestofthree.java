package day05;
// 10) Write a program to print the greatest among three numbers without using if statement
import java.util.Scanner;
public class gretestofthree {
    


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        int greatest = Math.max(a, Math.max(b, c));

        System.out.println("Greatest number is: " + greatest);

        input.close();
    }
}

    
