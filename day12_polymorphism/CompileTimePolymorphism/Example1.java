package day12_polymorphism.CompileTimePolymorphism;

public class Example1 {
    // different numbers of parameters
    int add(int a, int b) {
        return a + b;

    }

    // different types of parameters

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a+ b + c;
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2.5, 3.5));
    }
    
}

