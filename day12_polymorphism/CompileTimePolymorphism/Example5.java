package day12_polymorphism.CompileTimePolymorphism;
 // static method overloading 
public class Example5 {
     static int multiply(int a, int b) {
        return a * b;
    }
  // method overloading with different data types of parameters
    static double multiply(double a, double b) {
        return a * b;
    }

    // main method to test the static method overloading 

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(2.5, 4.0));
    }
}
    

