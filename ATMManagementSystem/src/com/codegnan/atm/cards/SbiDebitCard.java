package com.codegnan.atm.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.codegnan.atm.Exceptions.InsufficientBalanceException;
import com.codegnan.atm.Exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.Exceptions.InvalidAmountException;
import com.codegnan.atm.Exceptions.NotAOperatorException;
import com.codegnan.atm.service.IATMService;


public class SbiDebitCard implements IATMService {
	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type = "user";
	int chances;

	public SbiDebitCard(long debitCardNumber, String name, double accountBalance, int pinNumber) {
		chances = 3;
		this.debitCardNumber = debitCardNumber;
		this.name = name;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
		statement = new ArrayList<>();
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		if (wthAmount < 500 || wthAmount % 100 != 0) {
			throw new InvalidAmountException("Please withdraw more than 500 or Please withdraw multiples of 100");
		} else {
			if (wthAmount > accountBalance) {
				throw new InsufficientBalanceException(
						"you don't havee sufficient balance to withdraw. please check your account balance");
			} else {
				accountBalance -= wthAmount;
				statement.add("Debited : " + wthAmount);
				return wthAmount;
			}
		}
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
		if (dptAmount < 500 || dptAmount % 100 != 0) {
			throw new InvalidAmountException
			("please deposit multiple of 100 or mimum deposit is 500");
		}else {
			accountBalance+=dptAmount;
			statement.add("Credited : "+dptAmount);
		}

	}
	@Override
	public double checkAccountBalance() {
		return accountBalance;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
	}

	@Override
	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void decreaseChances() {
		--chances;
	}

	@Override
	public int getChances() {
		return chances;
	}

	@Override
	public void resetPinChances() {
	chances=3;
	}

	@Override
	public void generateMiniStatement() {
		int count=5;
		if(statement.size()==0) {
			System.out.println("There are no transactions happened");
			return;
		}
		System.out.println("============ List 5 Transaction==============");
		for(String trans:statement) {
			if(count==0) {
				break;
			}
			System.out.println(trans);
			count--;
		}
		Collections.reverse(statement);
	}
}