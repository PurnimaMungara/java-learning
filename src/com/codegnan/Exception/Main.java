package com.codegnan.Exception;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ATM atm = new ATM();
		boolean authenticated = false;
		 // ✅ Step 1: Verify PIN before showing menu
       while (!authenticated) {
           System.out.print("Enter your PIN: ");
           int enteredPin = scanner.nextInt();
           try {
               authenticated = atm.verifyPin(enteredPin); // true only if correct PIN
           } catch (InvalidPinException e) {
               System.out.println("InvalidPinException: " + e.getMessage());
                         }
       }
		while (true) {
			System.out.println("1. Deposit");
			System.out.println("2. withdraw");
			System.out.println("3. Check Balanace");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			try {
				switch (choice) {
				case 1:
					System.out.println("Enter Amount to deposit");
					double depositAmount = scanner.nextDouble();
					atm.depoist(depositAmount);
					break;
				case 2:
					System.out.println("Enter Amount to withdraw");
					double withdrawAmount = scanner.nextDouble();
					atm.withdraw(withdrawAmount);
					break;
				case 3:
					atm.checkBalance();
					break;
				case 4:
					System.out.println("Thank you for using ATM.");
					return;
				default:
					System.out.println("Invalid Choice. please choose the option 1-4");
				}
			} catch (InvalidAmountException | InsufficientFundException e) {
				e.printStackTrace();
				scanner.close();
			}
		}
		
	}
}



