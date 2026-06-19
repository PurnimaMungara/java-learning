package com.codegnan.oopprogramming;

public class ContractWork extends Employee1 {
	double contractAmount;

	public ContractWork(String name, double contractAmount) {
		super(name);
		this.contractAmount = contractAmount;
	}

	@Override
	public double calculateSalary() {
		return contractAmount;
	}

}