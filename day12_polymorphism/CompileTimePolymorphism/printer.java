package day12_polymorphism.CompileTimePolymorphism;

public class printer {

    void print(int num) {
        System.out.println("integer: " + num);

    }
    
    void print(String text) {
        System.out.println("string: " + text);
    }
}
