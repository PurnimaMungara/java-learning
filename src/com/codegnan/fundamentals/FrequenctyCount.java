package com.codegnan.fundamentals;

public class FrequenctyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,1,1,4,5,3,4};
		boolean[] proceed=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if(proceed[i]) {
				continue;
			}
		}//inialized frequent count has one because current element it self
		int count=1;
		int i=1;
		for(int j=1;j<array.length;j++) {
			if(array[j]==array[i]) {
				count++;
				proceed[j]=true;
			}
			
		}
		System.out.println(array[i]+"occurs"+count+"times");
	}

}
