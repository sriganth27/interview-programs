package Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {6,3,9,2,87};
		int max=arr[0];
		int min=arr[0];
		
		int n = arr.length;
		
		//max element 
		for(int i=0 ; i<n-1; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("max :"+max);
		
		//min arry
		for(int i=0 ; i<n-1; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		//sorting
		System.out.println("min :"+min);
		for(int i = 0 ; i<n-1 ; i++) {
			for (int j=0; j<n-1-i ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting :"+Arrays.toString(arr));
         
	}

}
