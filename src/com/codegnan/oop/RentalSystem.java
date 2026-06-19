package com.codegnan.oop;

import java.util.Scanner;

public class RentalSystem {
	private String model;
	private int year;
	public carrr() {
	
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static void main(String args) {
		RentalSystem car=new RentalSystem("toyoto",2022);
		Scanner sc=new Scanner(System.in);
		String user=sc.nextLine();
		car.setModel(user);
		int user=sc.nextInt();
		System.out.println(getter);args.out.println()
		sc.close();
	}
	
	

}
