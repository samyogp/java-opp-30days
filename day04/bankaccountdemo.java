package day04;
class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayBalance() {
        System.out.println(accountHolder + " balance: " + balance);
    }
}


public class bankaccountdemo {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.accountHolder = "Sita";
        acc1.deposit(5000);

        acc1.displayBalance();
    }
}
