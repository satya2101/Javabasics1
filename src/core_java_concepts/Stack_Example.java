package core_java_concepts;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<String> s1=new Stack<String>();
		//s1.push(10);
		//s1.push(2.80);
		s1.push("satya");
		//s1.push(true);
		
		System.out.println(s1);
		
		System.out.println(s1.pop());
		System.out.println(s1);
	}

}
