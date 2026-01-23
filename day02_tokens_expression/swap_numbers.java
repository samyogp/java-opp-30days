package day02_tokens_expression;


public class swap_numbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
