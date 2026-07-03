package com.codegnan.java8;

import java.util.function.Function;

public class StudentGradeFunctionExample {

	public static void main(String[] args) {
		Function <Student,String> grade=student->{
	if(student.marks>=80) {
		return "A Grade";
	}
	else {
		if(student.marks>=60) {
			return "A Grade";
		}else {
			if(student.marks>=40) {
				return "B Grade";
			}else {
				return "Fail";
			}
	}
}
	};
	Student s1=new Student("Purni", 78 );
	Student s2=new Student("Purniii", 55);
	Student s3=new Student("Purniiii", 14);
	System.out.println(s1.name+"---->"+grade.apply(s1));
	System.out.println(s2.name+"---->"+grade.apply(s2));
	System.out.println(s3.name+"---->"+grade.apply(s3));




	}

}
