package com.codegnan.java8;

import java.util.function.Function;

public class FunctionExample {

	/*public static void main(String[] args) {
		Function<Integer,Integer> f=n->n*n;
		System.out.println(f.apply(6));

	}

}*/
	/*public static void main(String[] args) {
		Function<String,Integer> s=n->n.length();
		System.out.println(s.apply("purni"));
	}
}*/
	public static void main(String[] args) {
		Function<Integer,Double>f=c->(c*9/5)/32.0;
		System.out.println(f.apply(30));
	}
}