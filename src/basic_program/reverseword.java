package basic_program;

import java.util.*;


public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hi iam sriganth";
		
		String [] word = input.split(" ");
		
		//method 1
		
		StringBuffer sb1= new StringBuffer(input);
	
		
		System.out.println("reverse word is "+	sb1.reverse()); 
		
		 //method 2
		Stack<String> stack = new Stack<>();
		
		for(String words: word ) {
			stack.push(words);
		}
		
		StringJoiner rsword = new StringJoiner(" ");
	
		while(!stack.isEmpty()) {
			rsword.add(stack.pop());
		}
		
		
		System.out.println("reverse word is "+rsword.toString());
		
		//method 3
		
		String rev=" ";
		for (String w : word) {
			StringBuffer sb = new StringBuffer(w);
			sb.reverse();
			
			rev = rev+sb.toString()+" ";
			
		}
		System.out.println("reverse word is "+rev.trim());

	}

}
