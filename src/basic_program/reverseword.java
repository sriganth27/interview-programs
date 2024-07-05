package basic_program;

import java.util.*;


public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hi iam sriganth";
		
		String [] word = input.split(" ");
		 
		Stack<String> stack = new Stack<>();
		
		for(String words: word ) {
			stack.push(words);
		}
		
		StringJoiner rsword = new StringJoiner(" ");
	
		while(!stack.isEmpty()) {
			rsword.add(stack.pop());
		}
		
		
		System.out.println("reverse word is "+rsword.toString());

	}

}
