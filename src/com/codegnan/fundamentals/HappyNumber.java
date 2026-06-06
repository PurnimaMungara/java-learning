package com.codegnan.fundamentals;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 19;
        int n = num;
        for (int i = 0; i < 20; i++) {  // limit to avoid infinite loop
            int sum = 0;
            // calculate sum of squares of digits
            for (int temp = n; temp > 0; temp = temp / 10) {
                int digit = temp % 10;
                sum += digit * digit;
            }
            n = sum;
            if (n == 1) {
                System.out.println(num + " is a Happy Number");
                return;
            }
        }

        System.out.println(num + " is NOT a Happy Number");
    }
}
  
}
