package Programs;

import java.util.*;

public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi iam Sriganth how are you";
		 
        System.out.println(input.toLowerCase());
		
		String [] words = input.split(" ");
		
		Stack<String> stack = new Stack<>();
		
		for(String word : words) {
			stack.push(word);
		}
		
        StringJoiner result = new StringJoiner(" ");
        
        while(!stack.isEmpty()) {
        	result.add(stack.pop());
        	
        	
        }
        
        System.out.println("reverse words: "+result.toString());
	}
	

}
