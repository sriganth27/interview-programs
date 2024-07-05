package Programs;

import java.util.Stack;

public class parantheses {

    static	String s="([])" ;
     
	static boolean isValid (String s) {
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			switch(c) {
			
			case '(' : case '[' : case '{':
				stack.push(c);
				break;
				
			case ')':
			if(stack.isEmpty() || stack.pop() !='(')
			return false;
			break;
			
			case '}':
				if(stack.isEmpty() || stack.pop() !='{')
				return false;
				break;
				
			case ']' :
				if(stack.isEmpty() || stack.pop() !='[')
				return false;
				break;
			}
		}
		
		return stack.isEmpty();   
	}

	 
	
	
	public static void main(String[] args) {
		
		System.out.println(isValid(s));
		

	}
	
}
