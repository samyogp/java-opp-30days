
package day09_Encapsulation.getterandsetter;




class Account {
    private int Balance;

    // setter only
    public void setBalance(int b) {
        Balance = b;
    }
}

public class WriteOnlyDemo {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setBalance(5000);  // allowed
        // acc.getBalance();   
    }
}
