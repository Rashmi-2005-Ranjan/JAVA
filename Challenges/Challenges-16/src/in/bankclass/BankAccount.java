package in.bankclass;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println ("New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance-= amount;
            System.out.println("Withdrawn: " + amount);
        }else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter account number: ");
        account.setAccountNumber(input.nextLong());
        input.nextLine(); // Consume newline
        System.out.print("Enter account holder name: ");
        account.setAccountHolderName(input.nextLine());
        System.out.print("Enter initial balance: ");
        account.setBalance(input.nextDouble());
        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Final Balance: " + account.getBalance());
        input.close();
    }
}
