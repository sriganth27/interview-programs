package basic_program;
import java.util.*;
public class swaptwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,2,3,4};
		int [] array2 = {5,6,7,8};
		
		System.out.println("before swapping arrays");
		System.out.println("array1" + Arrays.toString(array1));
		System.out.println("array2" +Arrays.toString(array2));
		
		 for(int i=0 ; i<array1.length; i++ ) {
		    	int temp = array1[i];
		    	array1[i] = array2[i];
		    	array2[i] = temp;
		    }
		
		System.out.println("after swapping arrays");
		System.out.println("array1" + Arrays.toString(array1));
		System.out.println("array2" +Arrays.toString(array2));
		
		

	}
	
	

}

