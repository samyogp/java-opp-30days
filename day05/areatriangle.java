package day05;

import java.util.Scanner;


public class areatriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = input.nextDouble();

        double area = (base * height) / 2;

        System.out.println("Area of the triangle is: " + area);

        input.close();
    }
}
