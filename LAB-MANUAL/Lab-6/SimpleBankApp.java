import java.util.Scanner;

class BankAccount {
    private double balance; 

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative. Setting balance to ₹0.");
            initialBalance = 0;
        }
        this.balance = initialBalance;
    }
    

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
        } else {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class SimpleBankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialBalance = 0;

        System.out.print("Enter initial balance: ₹");
        if (sc.hasNextDouble()) {
            initialBalance = sc.nextDouble();
        } else {
            System.out.println("Error: Invalid input! Setting balance to ₹0.");
            sc.next(); 
        }

        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter amount to deposit: ₹");
        if (sc.hasNextDouble()) {
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
        } else {
            System.out.println("Error: Invalid input! Deposit failed.");
            sc.next(); 
        }

        System.out.print("Enter amount to withdraw: ₹");
        if (sc.hasNextDouble()) {
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } else {
            System.out.println("Error: Invalid input! Withdrawal failed.");
            sc.next(); 
        }

        account.showBalance();
        sc.close();
    }
}
