package day12_polymorphism.CompileTimePolymorphism;

public class MathUtils {
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
    
}

