package Arrays;

import java.util.TreeSet;

public class dublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,2,4,5};
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		
		for(int num : arr) {
			if(!t1.add(num))
			t2.add(num);
		}
		
		t1.removeAll(t2);
		
		
		for(int num : t1) {
			System.out.println(" "+num);
		}
		
		System.out.println(t1);
		System.out.println(t2);

	}

}
