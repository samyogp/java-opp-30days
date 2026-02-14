package day12_polymorphism.CompileTimePolymorphism;

public class Example2 {

    void print(int num) {
        System.out.println("integer: " + num);

    }
    
    void print(String text) {
        System.out.println("string: " + text);
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.print(10);
        obj.print("Hello");

    }
}
