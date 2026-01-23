package day02_tokens_expression;

import java.util.Scanner;

public class Area_Of_Trangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of triangle = " + area);

        sc.close();
    }
}
