package com.codegnan.fundamentals;

import java.util.Scanner;

public class productofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10) {
            int product = 1;

            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
          if(  n == product) {
            	System.out.println(n);
            }
        }
        sc.close();
    } 
}

