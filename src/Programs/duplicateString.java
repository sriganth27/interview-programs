package Programs;

import java.util.*;

public class duplicateString {

	public static void main(String[] args) {
		String str = "sasikumar";
		
		Set <Character> unique = new HashSet<>();
		Set <Character> duplicate = new HashSet<>();
		
		for(char element : str.toCharArray()) {
			if(!unique.add(element)) {
				duplicate.add(element);
				
			}
			
		}
		
		for(char element2 : duplicate) {
			System.out.print(element2+ " ");
		}
		System.out.println();
		unique.removeAll(duplicate);
		
		for(char element : unique) {
			System.out.print(element+ " ");
		}
	}

}
