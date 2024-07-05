package Programs;

import java.util.*;


public class duplicateElemetns {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,2,5,5,7,8};
		
		int sum=0;
		Set<Integer> s1 = new TreeSet<>();
		Set<Integer> s2 = new TreeSet<>();
		
		for(int element :arr) {
			if(!s1.add(element))
			{
				s2.add(element);
			}
		
		}
		s1.removeAll(s2);
		System.out.print("unique elements are : ");
		for(int element : s1) {
			System.out.print(element+" ");
		}
		
	
		for(int s : s1) {
			sum+=s;
			
		}
		System.out.println("unique elements count :"+sum+" ");

	}

}
