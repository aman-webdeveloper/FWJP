import java.util.Scanner;

class Main {  
    private String accountNumber = "123456";
    private String pin = "1234";
    private String phoneNumber = "9876543210";
    private double balance = 5000.0;
    private boolean isAuthenticated = false;
    private int attempts = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public void authenticate() {
        while (attempts < 3) {
            System.out.print("Enter Account Number: ");
            String acc = sc.nextLine();
            System.out.print("Enter PIN: ");
            String userPin = sc.nextLine();
            
            if (acc.equals(accountNumber) && userPin.equals(pin)) {
                isAuthenticated = true;
                System.out.println("Login Successful!");
                showMenu();
                return;
            } else {
                attempts++;
                System.out.println("Incorrect Account Number or PIN. Attempts left: " + (3 - attempts));
            }
        }
        System.out.println("Too many failed attempts! Transaction blocked.");
    }
    
    private void showMenu() {
        while (isAuthenticated) {
            System.out.println("\nATM MENU:");
            System.out.println("1. View Balance");
            System.out.println("2. Change PIN");
            System.out.println("3. Change Phone Number");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Register/Create PIN");
            System.out.println("7. Logout");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> viewBalance();
                case 2 -> changePIN();
                case 3 -> changePhoneNumber();
                case 4 -> depositMoney();
                case 5 -> withdrawMoney();
                case 6 -> registerPIN();
                case 7 -> {
                    logout();
                    return;
                }
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void viewBalance() {
        System.out.println("Your Current Balance: ₹" + balance);
    }

    private void changePIN() {
        System.out.print("Enter New PIN: ");
        String newPin = sc.nextLine();
        pin = newPin;
        System.out.println("PIN changed successfully!");
    }

    private void changePhoneNumber() {
        System.out.print("Enter New Phone Number: ");
        String newPhone = sc.nextLine();
        phoneNumber = newPhone;
        System.out.println("Phone number updated successfully!");
    }

    private void depositMoney() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully! New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    private void withdrawMoney() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    private void registerPIN() {
        System.out.print("Enter New PIN to Register: ");
        String newPin = sc.nextLine();
        pin = newPin;
        System.out.println("New PIN registered successfully!");
    }

    private void logout() {
        isAuthenticated = false;
        System.out.println("Logged out successfully!");
    }

    public static void main(String[] args) {
        Main atm = new Main(); // Changed class reference to Main
        atm.authenticate();
    }
}