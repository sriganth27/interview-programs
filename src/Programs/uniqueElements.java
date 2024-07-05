package Programs;
import java.util.*;
public class uniqueElements {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,2,3,4,5,6,6,5,7,8,9,0};
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(int element : arr ) {
			if(!unique.add(element)) {
				duplicate.add(element);
			}
			
		}
		System.out.print("Without duplicate elemets ");
		for(int element : unique) {
			
			System.out.print(element + " ");
			
		}
		System.out.println();
		
		unique.removeAll(duplicate);
		System.out.print("unique elemets ");
		for(int element : unique) {
		
			System.out.print(element+ " ");
			
		}
		System.out.println();
		System.out.print("duplicate elemets ");
		for(int element2 : duplicate) {
			
			System.out.print(element2 + " ");
		}
	}

}
