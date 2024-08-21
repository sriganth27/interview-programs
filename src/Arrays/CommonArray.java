package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5};
		int [] arr2 = {3,4,5,6,7};
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		
		for(int a1 : arr) {
			s1.add(a1);
		}
		
		for(int a2: arr2) {
			if(s1.contains(a2)) {
				s2.add(a2);
			}
		}
		
		
		System.out.println("common elements : "+s2);
		

	}

}
