package Arrays;

public class MaxPossibleSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i; j<arr.length ; j++) {
				System.out.print("{");
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]);
					
					if(k<j) {
						System.out.print(",");
					}
				}
				System.out.print("}");
			}
		}

	}

}
