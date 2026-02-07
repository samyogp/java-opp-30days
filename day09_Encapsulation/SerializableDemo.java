package day09_Encapsulation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {



    // Student class 
    static class Student implements Serializable {
        private int roll;
        private String name;

        public Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public String getName() {
            return name;
        }
    }

    // main method to print output
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Ram");

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("student.ser"));

            out.writeObject(s);
            out.close();

            System.out.println("Student object saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
