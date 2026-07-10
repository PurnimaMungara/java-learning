package com.codegnan.atm.Exceptions;


public class InvalidPinException extends Exception {
	public InvalidPinException(String msg) {
		super(msg);
	}
}