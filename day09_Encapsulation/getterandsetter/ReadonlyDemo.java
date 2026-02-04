package day09_Encapsulation.getterandsetter;
// in read only classes we provide only getter method no setter method.


public class ReadonlyDemo {
    private int roll;
    // constructor to initialize roll number
    public ReadonlyDemo(int r) {
        roll = r;
    }
    public int getRoll() {
        return roll;
    }
    
}


/* using main class to test the readonly class 
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Roll: " + s.getRoll());
    }
}
output :
Roll: 0

 */