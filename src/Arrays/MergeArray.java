package Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {5,6,7,8};
		
		int length1 = arr1.length;
		int length2 = arr2.length;
		
		int [] mergeArray = new int [length1+length2];
		
		System.arraycopy(arr1, 0, mergeArray, 0, length1);
		System.arraycopy(arr2, 0, mergeArray, length1, length2);
		
		System.out.println("merger array");
		for(int i =0 ; i<mergeArray.length;i++) {
			System.out.print(mergeArray[i]+" ");
		}

	}

}
