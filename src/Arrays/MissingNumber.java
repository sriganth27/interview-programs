package Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,5,6,7};
		int n = arr.length+1;
		int expectedSum = n*(n+1)/2;
		
		int sum=0;
		for(int num : arr) {
			sum +=num;
		}
		
		int result = expectedSum - sum;
		
		System.out.println(result);

	}

}
