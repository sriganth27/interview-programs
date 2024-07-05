package Programs;


import java.util.Arrays;

public class SecondLaegestElement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,4,2,8,5,10,23,0};
		Arrays.sort(arr);
		int result = arr[arr.length-2];
		int result1 = arr[arr.length-1];
		
		
		System.out.println("FirstLargest Elements is "+result1);
		System.out.println("SecondLargest Elements is "+result);
		
		
	}
	
	

}
