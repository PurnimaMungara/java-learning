package com.codegnan.Assignment;

import java.util.Scanner;

public class VendingMachineMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Menu=sc.nextInt();
		switch(Menu){
			case 1:
				System.out.println(" You have selected Coke. Enjoy your drink!");
				break;
			case 2:
				System.out.println("You have selected Pepsi.Enjoy your drink!");
				break;
			case 3:
				System.out.println(" You have selected Water. Enjoy your drink!");
				break;
			case 4:
				System.out.println("You have selected snickker .Enjoy your drink!");
				break;
		
		case 5:
			System.out.println("Thank you for using the Vending Machine. Have a nice day!");
			break;
			default:
				System.out.println("Invalid message");
		sc.close();
	}
	}

}
