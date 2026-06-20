package com.codegnan.Assignment;


import java.util.Scanner;

public class OccurenceOfEachCharacter  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Skip already counted characters
            boolean visited = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    visited = true;
                    break;
                }
            }

            if (visited) {
                continue;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);
        }

        sc.close();
    }
}