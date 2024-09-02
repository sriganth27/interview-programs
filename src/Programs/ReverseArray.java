package Programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr = {1,2,5,6,7};
		int temp;
		String str = "sriganth";
		
		String [] str1 = str.split("");
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str1[i] + "");
		}
	}

}
