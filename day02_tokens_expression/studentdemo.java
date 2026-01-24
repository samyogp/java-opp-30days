package day02_tokens_expression;


class student {
    String name;
    int rollNumber;
    double marks;
    boolean ispassed;
    // method to display student information 
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + ispassed);
        System.out.println("----------------------- ");

    }
}

public class studentdemo {
    public static void main(String[] args) {
        // create student first object 
        student student1 = new student();
        student1.name = "Samyog";
        student1.rollNumber = 101;
        student1.marks = 89.5;
        student1.ispassed = true;


        // creating student second object given below lets gooo
        student student2 = new student();
        student2.name = "Samriddhi";
        student2.rollNumber = 102;
        student2.marks = 92.0;
        student2.ispassed = true;
        // display student information
        student1.displayInfo();
        student2.displayInfo();
        }
    
}
