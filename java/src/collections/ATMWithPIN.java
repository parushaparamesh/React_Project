package collections;
import java.util.Scanner;

public class ATMWithPIN {
    private static double balance = 1000; // Initial balance
    private static int PIN = 4150; // Default PIN

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();

        if (validatePIN(enteredPIN)) {
            System.out.println("PIN accepted. Welcome to the ATM!");

            while (true) {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        withdraw(scanner);
                        break;
                    case 4:
                        changePIN(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting ATM. Thank you!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid PIN. Exiting...");
        }
    }

    private static boolean validatePIN(int enteredPIN) {
        return enteredPIN == PIN;
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void changePIN(Scanner scanner) {
        System.out.print("Enter your current PIN: ");
        int currentPIN = scanner.nextInt();

        if (validatePIN(currentPIN)) {
            System.out.print("Enter your new PIN: ");
            int newPIN = scanner.nextInt();
            PIN = newPIN;
            System.out.println("PIN successfully changed.");
        } else {
            System.out.println("Invalid PIN. Cannot change PIN.");
        }
    }
}
