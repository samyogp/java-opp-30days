package day09_Encapsulation.getterandsetter;


class Student {

    private int roll;
    private String name;

    // Setter for roll
    public void setRoll(int r) {
        roll = r;
    }

    // Getter for roll
    public int getRoll() {
        return roll;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}


public class GetterSetterDemo {

     public static void main(String[] args) {

        Student s = new Student();

        // setting values using setter
        s.setRoll(1);
        s.setName("Ram");

        // getting values using getter
        System.out.println("Roll No: " + s.getRoll());
        System.out.println("Name: " + s.getName());
    }
}
