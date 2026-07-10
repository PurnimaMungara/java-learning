package com.codegnan.atm.Exceptions;


public class InvalidCardException extends Exception {
	public InvalidCardException(String msg) {
		super(msg);
	}
}