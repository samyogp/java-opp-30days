package day04;
class Book {
    String title;
    String author;

    void read() {
        System.out.println("Reading " + title + " by " + author);
    }
}


public class bookdemo {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James";

        b1.read();
    }
    
}
