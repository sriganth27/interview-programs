package Programs;

import java.util.Arrays;

public class BInarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,6,8,2,8};
		
		Arrays.sort(arr);
		
		int left =0;
		int right=arr.length-1;
		int result=-1;
		int key=6;
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid]==key) {
				result=mid;
				break;
			}
			
			else if(arr[mid]<key) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		if(result==-1) {
			System.out.println("Element not found ");
		}
		else {
			System.out.println("Element found at index "+result);
		}
		
		
		

	}

}
