package Arrays;

import java.util.Arrays;

public class CountIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sri5456";
		
		String [] str1 = str.split("");
	
	    int sum =0;
			
			for(String element : str1) {
				try {
					int num = Integer.parseInt(element);
					sum +=num;
				}
				catch (Exception a) {
					
				}
				
			}
			System.out.println(sum);
			
		
			
		}
		
	

	}


