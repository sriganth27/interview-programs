package Arrays;

import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.next();
		
		
		StringBuffer sb = new StringBuffer();
		
		
		for(int i =0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch >='A' && ch <='Z') {
				sb.append((char) (ch+ 32));
				
			}
			else if (ch >='a' && ch<='z') {
				sb.append((char) (ch -32));
			}
			else {
				sb.append(ch);
			}
		}
		
		System.out.println("the String afte toggles :"+sb.toString());
		

	}

}
