package com.codegnan.atm.Exceptions;


public class InvalidAmountException extends Exception {
	public InvalidAmountException(String msg) {
		super(msg);
	}
}