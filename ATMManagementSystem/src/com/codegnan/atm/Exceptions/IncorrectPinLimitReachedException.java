package com.codegnan.atm.Exceptions;


public class IncorrectPinLimitReachedException extends Exception {
	public IncorrectPinLimitReachedException(String msg) {
		super(msg);
	}
}