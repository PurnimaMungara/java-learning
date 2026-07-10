
package com.codegnan.atm.cards;

import com.codegnan.atm.Exceptions.InsufficientBalanceException;
import com.codegnan.atm.Exceptions.InsufficientMachineBalanceException;
import com.codegnan.atm.Exceptions.InvalidAmountException;
import com.codegnan.atm.Exceptions.NotAOperatorException;
import com.codegnan.atm.service.IATMService;

public class OperatorCard implements IATMService {
	private int pinNumber;
	private long id;
	private String name;
	private final String type = "Operator";

	public OperatorCard(long id, int pin, String name) {
		this.id = id;
		this.pinNumber = pin;
		this.name = name;
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		return 0;
	}

	@Override
	public void depositAmount(double dptAmount) throws InvalidAmountException {
	}

	@Override
	public double checkAccountBalance() {
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
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
	}

	@Override
	public int getChances() {
		return 0;
	}

	@Override
	public void resetPinChances() {
	}

	@Override
	public void generateMiniStatement() {
	}
}