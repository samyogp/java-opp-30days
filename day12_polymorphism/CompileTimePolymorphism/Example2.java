package day12_polymorphism.CompileTimePolymorphism;
// different data types of parameters
public class Example2 {

    void print(int num) {
        System.out.println("integer: " + num);

    }
    // method overloading with different data types of parameters 
    void print(String text) {
        System.out.println("string: " + text);
    }
    // main method to test the method overloading with different dat types of parameters
    
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.print(10);
        obj.print("Hello");

    }
}
