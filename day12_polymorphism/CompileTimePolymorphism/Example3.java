package day12_polymorphism.CompileTimePolymorphism;

public class Example3 {
    // different order of parameters 
    void display(int a, String b) {
        System.out.println("a = " + a + ", b = " + b);


    }
    void display(String a, int b) {
        System.out.println("a = " + a + ", b = " + b);

    }
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.display(10, "Hello");
        obj.display("World", 20);
    }
    
}
