package day12_polymorphism.CompileTimePolymorphism;

public class Example3 {
    // different order of parameters 
    void display(int a, String b) {
        System.out.println("a = " + a + ", b = " + b);


    }
    // method overloading with different order of parameters
    void display(String a, int b) {
        System.out.println("a = " + a + ", b = " + b);

    }
    //main method to test the method overloading with different order of parameters
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.display(10, "Hello");
        obj.display("World", 20);
    }
    
}
