package Arrays;

public class MaxSubArray {
	
	

	public static void main(String[] args) {
		int num[] = {5,4,-1,7,8};
		int current = num[0]; 
		int max=num[0];
		
		for(int i =1 ; i<num.length; i++) {
			current = Math.max(num[i], num[i]+current);
			max=Math.max(current,max);
		}
		System.out.println(max);

	}

}
