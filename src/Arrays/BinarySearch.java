package Arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,5,6,7,8};
		Arrays.sort(arr);
		int key = 7;
		
		int left = 0;
		int right = arr.length-1;
		int result = -1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid] == key) {
				result = mid;
				break;
			}
			else if (arr[mid]<key) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		
		System.out.println("the postion of "+key+" is : "+result);
	}

}
