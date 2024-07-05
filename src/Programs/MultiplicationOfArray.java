package Programs;

public class MultiplicationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int product = 1;
		
		for(int num : arr) {
			product*=num;
		}
		
		System.out.println(product);

	}

}
