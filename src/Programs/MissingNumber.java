package Programs;

public class MissingNumber {
	static int arr [] = {1,2,3,5,6};
	static int FindMissingNumber() {
		int n = arr.length + 1;
		int expectedSum = (n*(n+1))/2;
		int sum = 0;
		
		for (int num : arr) {
			sum += num;
		}
		return expectedSum - sum;
	}
	
	public static void main (String [] args) {
	
		System.out.println(FindMissingNumber());
	}

}
