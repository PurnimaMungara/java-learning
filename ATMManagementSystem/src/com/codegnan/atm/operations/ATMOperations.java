package com.codegnan.atm.operations;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.codegnan.atm.Exceptions.IncorrectPinLimitReachedException;
import com.codegnan.atm.Exceptions.InsufficientBalanceException;
import com.codegnan.atm.Exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.Exceptions.InvalidAmountException;
import com.codegnan.atm.Exceptions.InvalidCardException;
import com.codegnan.atm.Exceptions.InvalidPinException;
import com.codegnan.atm.Exceptions.NotAOperatorException;
import com.codegnan.atm.cards.AxisDebitCard;
import com.codegnan.atm.cards.HdfcDebitCard;
import com.codegnan.atm.cards.KotakDebitCard;
import com.codegnan.atm.cards.OperatorCard;
import com.codegnan.atm.cards.SbiDebitCard;
import com.codegnan.atm.service.IATMService;



public class ATMOperations {
	// initial ATM Machine Balance
	private static double ATM_MACHINE_BALANCE = 1000000.0;
// List to keep track all activities perfomed on the ATM.
	public static ArrayList<String> ACTIVITY = new ArrayList<>();

// Database to map card numbers to card objects.
	public static HashMap<Long, IATMService> dataBase = new HashMap<>();
// flag to indicate if the ATM Machine is on or off.
	public static boolean MACHINE_ON = true;
// refeerence to the current card in use.
	public static IATMService card;

// validate the insertedcard by checking againist in database.
	public static IATMService validateCard(long cardNumber) throws InvalidCardException {
		if (dataBase.containsKey(cardNumber)) {
			return dataBase.get(cardNumber);
		} else {
			ACTIVITY.add("Accessed By " + cardNumber + " is Not Compatiable");
			throw new InvalidCardException("This is Not a Valid Card");
		}
	}

	public static void checkAtmMachineActivities() {
		System.out.println("================= Activities Perfoemd===================");
		;
		for (String activity : ACTIVITY) {
			System.out.println("====================================================");
			System.out.println(activity);
			System.out.println("====================================================");
		}
	}

	public static void resetUserAttempts(IATMService operatorCard) {
		IATMService card = null;
		long number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Card Number : ");
		number = scanner.nextLong();
		try {
			card = validateCard(number);
			card.resetPinChances();// resetting pin attempts for the specified card.
			ACTIVITY.add("Accessed By : " + operatorCard.getUserName() + " to reeset number of chances for user");
		} catch (InvalidCardException e) {
			e.printStackTrace();
		}
	}

	public static IATMService validateCredentials(long cardNumber, int pinNumber)
			throws InvalidCardException, InvalidPinException, IncorrectPinLimitReachedException {
		if (dataBase.containsKey(cardNumber)) {
			card = dataBase.get(cardNumber);
		} else {
			throw new InvalidCardException("This Card is Not a valid card");
		}
		try {
			if (card.getUserType().equals("Operator")) {
				if (card.getPinNumber() != pinNumber) {
					throw new InvalidPinException("Dear Operator. Please Enter Correct Pin Number");
				} else {
					return card;
				}
			}
		} catch (NotAOperatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (card.getChances() <= 0) {
			throw new IncorrectPinLimitReachedException(
					"You have reached wrong limit of Pin Number, which is 3 attempts");
		}
		if (card.getPinNumber() != pinNumber) {
			card.decreaseChances();
			throw new InvalidPinException("You Have Entered a Wrong Pin Nummber");
		} else {
			return card;
		}
	}

	public static void validateAmount(double amount) throws InsufficientMachineBalanceException {
		if (amount > ATM_MACHINE_BALANCE) {
			throw new InsufficientMachineBalanceException("Insufficient Cash in the machine");
		}
	}

	public static void validateDepositAmount(double amount)
			throws InvalidAmountException, InsufficientMachineBalanceException {
		if (amount % 100 != 0) {
			throw new InvalidAmountException("Please Deposit Multiple of 100");
		}
		if (amount + ATM_MACHINE_BALANCE > 2000000.0) {
			ACTIVITY.add("Unable to Deposit Cash in the Machine");
			throw new InsufficientMachineBalanceException(
					"You can't deposit cash a the limit of the machine is reeached");
		}
	}

	public static void operatorMode(IATMService card) {
		Scanner scanner = new Scanner(System.in);
		double amount;
		boolean flag = true;
		while (flag) {
			System.out.println("Operator Mode : Operator Name " + card.getUserName());
			System.out.println("||================================================||");
			System.out.println("||========1. Switch off the Machine===============||");
			System.out.println("||========2. Check ATM Machine Balance============||");
			System.out.println("||========3. Deposit Cash In the machine==========||");
			System.out.println("||========4. Reset User Pin Attempts==============||");
			System.out.println("||========5. TO Chek Activities Perfomed in The Machine==============||");
			System.out.println("||========6. Exit Operator Mode===================||");
			System.out.println("||================================================||");
			System.out.println("Plese Enter Your Choice");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				MACHINE_ON = false;
				ACTIVITY.add("Accessed By " + card.getUserName() + " Activity Perfoemd : Switching Off The Machine");
				flag = false;
				break;
			case 2:
				ACTIVITY.add("Accessed By " + card.getUserName() + " Activity Perfoemd : Checking ATM Machine Balance");
				System.out.println("The Balance of ATM Machine is " + ATM_MACHINE_BALANCE + "is avaailable");
				break;
			case 3:
				System.out.println("Enter The Amount to Deposit");
				amount = scanner.nextDouble();
				try {
					validateDepositAmount(amount);
					ATM_MACHINE_BALANCE += amount;
					ACTIVITY.add("Accessed By " + card.getUserName()
							+ " Activity Perfoemd : Depositing Cash in the ATM Machine");
					System.out.println("===============================================");
					System.out.println("======Cash Added in the ATM Machine============");
					System.out.println("===============================================");
				} catch (InvalidAmountException | InsufficientMachineBalanceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				resetUserAttempts(card);
				System.out.println("===============================================");
				System.out.println("======User Attempts are Reset==================");
				System.out.println("===============================================");
				ACTIVITY.add("Accessed By " + card.getUserName()
						+ " Activity Perfoemd : Resetting the Pin Attempts of User");
				break;
			case 5:
				checkAtmMachineActivities();
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("You have Entered a Wrong Option");
			}

		}
	}

	public static void main(String[] args) throws NotAOperatorException {
		dataBase.put(2222222222l, new AxisDebitCard(2222222222l, "dasu", 50000.0, 2222));
		dataBase.put(33333333333l, new SbiDebitCard(33333333333l, "sharma", 40000.0, 3333));
		dataBase.put(4444444444l, new KotakDebitCard(4444444444l, "malli", 70000.0, 4444));
		dataBase.put(5555555555l, new HdfcDebitCard(5555555555l, "mani", 65000.0, 5555));
		dataBase.put(1111111111l, new OperatorCard(1111111111l, 2222, "arjun"));
		Scanner scanner = new Scanner(System.in);
		long cardNumber = 0;
		double depositAmount = 0.0;
		double withdrawAmount = 0.0;
		int pin = 0;
		while (MACHINE_ON) {
			System.out.println("Please Enter the Card Number ");
			cardNumber = scanner.nextLong();
			System.out.println("Please Enter the PIN Number");
			pin = scanner.nextInt();
			try {
				card = validateCredentials(cardNumber, pin);
				if (card == null) {
					System.out.println("card validation failed");
					continue;
				}
				ACTIVITY.add("Accessed By: " + card.getUserName() + " Status: Access Approved");
				if (card.getUserType().equals("Operator")) {
					operatorMode(card);
					continue;
				}
				while (true) {
					System.out.println("User Mode : " + card.getUserName());
					System.out.println("||===========================================||");
					System.out.println("||=========1. Withdraw Amount================||");
					System.out.println("||=========2. Deposit Amount=================||");
					System.out.println("||=========3. Check Balance==================||");
					System.out.println("||=========4. Change Pin ====================||");
					System.out.println("||=========5. Mini Statement=================||");
					System.out.println("||===========================================||");
					System.out.println("Enter Your Choice");
					int option = scanner.nextInt();
					try {
						switch (option) {
						case 1:
							System.out.println("Please Enter the Amount to Withdraw ");
							withdrawAmount = scanner.nextDouble();
							validateAmount(withdrawAmount);
							card.withdrawAmount(withdrawAmount);
							ATM_MACHINE_BALANCE -= withdrawAmount;
							ACTIVITY.add("Accessed By " + card.getUserName() + " Activity: Amount Withdrawn "
									+ withdrawAmount + " From Machine");
							break;
						case 2:
							System.out.println("Please Enter The Amount to Deposit");
							depositAmount = scanner.nextDouble();
							validateDepositAmount(depositAmount);
							ATM_MACHINE_BALANCE += depositAmount;
							card.depositAmount(depositAmount);
							ACTIVITY.add("Accessed By " + card.getUserName() + " Activity: Amount Deposited "
									+ depositAmount + " in the Machine");
							break;
						case 3:
							System.out.println("Your Account Balance is : " + card.checkAccountBalance());
							ACTIVITY.add("Accessed By " + card.getUserName() + " Activity: Checking the Balance");
							break;
						case 4:
							System.out.println("Enter a New Pin");
							pin = scanner.nextInt();
							card.changePinNumber(pin);
							ACTIVITY.add("Accessed By " + card.getUserName() + " Activity: Changed PIN Number");
							break;
						case 5:
							ACTIVITY.add("Accessed By " + card.getUserName() + " Activity: Generating MINI Statement");
							card.generateMiniStatement();
							break;
						default:
							System.out.println("You have Entered a wrong option");
							break;
						}
						System.out.println("Do You Want to continue?(Y/N)");
						String nextOption = scanner.next();
						if (nextOption.equalsIgnoreCase("n")) {
							break;
						}
					} catch (InvalidAmountException | InsufficientBalanceException
							| InsufficientMachineBalanceException e) {
						e.printStackTrace();
					}
				}
			} catch (InvalidCardException | InvalidPinException | IncorrectPinLimitReachedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("====================================================");
		System.out.println("====Thank You For Using ICCI ATM Machine ===========");
		System.out.println("====================================================");
	}
}