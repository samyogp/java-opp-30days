package day02_tokens_expression;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    boolean isActive;

    void displayAccount () {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Active: " + isActive);
        System.out.println("----------------------- ");
    }
}

public class mainbank {
    public static void main(String[] args) {
        // create first bank account object 
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Samyog Phuyal";
        account1.accountNumber = "123456789";
        account1.balance = 1500.75;
        account1.isActive = true;

        // create second bank account object 
        BankAccount account2 = new BankAccount();
        account2.accountHolder = "Ram";
        account2.accountNumber = "987654321";
        account2.balance = 2500.00;
        account2.isActive = true;

        // display bank account information
        account1.displayAccount();
        account2.displayAccount();
    }
    
}
