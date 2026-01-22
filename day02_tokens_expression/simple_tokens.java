package day02_tokens_expression;

public class simple_tokens {
    public static void main(String[] args) {
        String expression = "3 + 5 - 2"; // this is our expression

        // Split the expression by space to get tokens
        String[] tokens = expression.split(" ");

        System.out.println("Tokens in the expression:");
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
