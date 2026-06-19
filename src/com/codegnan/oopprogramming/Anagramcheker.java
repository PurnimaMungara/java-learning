package com.codegnan.oopprogramming;

public class Anagramcheker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="eat";
 String s2="tea";
 //check if lengths are equal
if(s1.length()!=s2.length()) {
	System.out.println("not anagram");
			return;
}
boolean isanagram=true;
for(int i=0;i<s1.length();i++) {
	//take one char from s1
	char ch=s1.charAt(i);
	//intialize
	int count1=0;
	int count2=0;
	for(int j=0;j<s1.length();j++) {
		if(ch==s1.charAt(j)) {
			count1++;
		}
	}
	for(int j=0;j<s2.length();j++) {
		if(ch==s2.charAt(j)) {
			count2++;
		}
	}
	if(count1!=count2) {
		isanagram=false;
		break;
		
	}
	
}
if(isanagram) {
	System.out.println("angram");
}
else {
	System.out.println("Not angram");
}
	}

}
