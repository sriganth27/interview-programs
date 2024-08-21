package Arrays;

public class MaxSubArray {
	
	public static int maxsub(int [] num) {
		int current = num[0]; 
		int max=num[0];
		
		for(int i =1 ; i<num.length; i++) {
			current = Math.max(num[i], num[i]+current);
			max=Math.max(current,max);
		}
		
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {5,4,-1,7,8};
		System.out.println(maxsub(arr));

	}

}
