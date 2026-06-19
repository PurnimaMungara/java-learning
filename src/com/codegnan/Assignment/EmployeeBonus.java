package com.codegnan.Assignment;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int roleCode=sc.nextInt();
		int salary=sc.nextInt();
		int bonusAmount;
		switch(roleCode) {
		case 1:
		bonusAmount=salary+(salary*10/100-(salary));
			System.out.println(bonusAmount);
			break;
		case 2:
			bonusAmount=salary+(salary*10/100-(salary));
			System.out.println(bonusAmount);
			break;
		case 3:
			bonusAmount=salary+(salary*10/100-(salary));
			System.out.println(bonusAmount);
			break;
			default:
				System.out.println("Invalid Message");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
