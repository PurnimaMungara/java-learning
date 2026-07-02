package com.codegnan.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElementsinArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("List after removing duplicates: " + uniqueList);

        sc.close();
    }
}