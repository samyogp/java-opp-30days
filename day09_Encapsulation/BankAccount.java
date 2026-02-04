package day09_Encapsulation;
// java connection 
//variables are private and methods act as public interface to access the variables
// internal logic in hidden  from outside world

public class BankAccount {
    private int Balance = 1000;
    public void withdraw(int amount) {

        Balance = Balance - amount;

    }
    public int getBalance() {
        return Balance;
    }
    
}

// test class for bank account with main class and output the balance after withdrawal


/* public class BankTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        System.out.println("Initial Balance: " + b.getBalance());

        b.withdraw(400);
        System.out.println("Balance after withdrawal: " + b.getBalance());
    }
}

output is here :
Initial Balance: 1000
Balance after withdrawal: 600
 */
