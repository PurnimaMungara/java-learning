package com.codegnan.atm.Exceptions;



public class InsufficientMachineBalanceException extends Exception {
	public InsufficientMachineBalanceException(String msg) {
		super(msg);
	}
}