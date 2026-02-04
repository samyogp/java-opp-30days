package day09_Encapsulation.getterandsetter;
import java.util.Scanner;


class Account {

    private int accountNo;
    private double balance;

    // setter
    public void setAccountNo(int accNo) {
        accountNo = accNo;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    // getter
    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }
}



public class BankAccounntGetttterSetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        a.setAccountNo(accNo);

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();
        a.setBalance(bal);

        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + a.getAccountNo());
        System.out.println("Balance: " + a.getBalance());

        sc.close();
    }
}
