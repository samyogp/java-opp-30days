package day09_Encapsulation;

public class TestAccount {
    public static void main(String[] args) {
       AccountDemo acc = new AccountDemo();
         acc.setBalance(50000);
         System.out.println(acc.getBalance());
    }
}

