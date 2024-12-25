package Exercise_18;

/*
Q.4. mplement Exception Handling in a real-world scenario, select any topic, and program it.

ans : 
*/
import java.util.Scanner;

	// Custom Exception for Insufficient Balance
	class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}

	// Custom Exception for Invalid Input
	class InvalidInputException extends Exception {
	    public InvalidInputException(String message) {
	        super(message);
	    }
	}

	public class Q4 {
	    private double balance;

	    // Constructor to initialize balance
	    public Q4(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) throws InsufficientBalanceException, InvalidInputException {
	        if (amount <= 0) {
	            throw new InvalidInputException("Invalid amount. Please enter a positive value.");
	        }
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance. Cannot process the withdrawal.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful! Remaining balance: " + balance);
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an ATM system with an initial balance of 5000
	        Q4 atm = new Q4(5000);

	        try {
	            System.out.println("Welcome to the ATM System!");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw Money");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    atm.checkBalance();
	                    break;

	                case 2:
	                    System.out.print("Enter the amount to withdraw: ");
	                    double amount = scanner.nextDouble();
	                    atm.withdraw(amount);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } catch (InvalidInputException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (InsufficientBalanceException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Thank you for using the ATM System!");
	            scanner.close();
	        }
	    }
	}

