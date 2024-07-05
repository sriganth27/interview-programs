package Programs;

import java.util.*;

public class MostRepetingCharacters {

	public static void main(String[] args) {
		String str ="succsesseas";
		
		Map<Character,Integer> m1=  new HashMap<>();
		
		for(char c : str.toCharArray()) {
			m1.put(c, m1.getOrDefault(c, 0) + 1);
		}

		int max=0;
		char mostFrequent = ' ';
		
		for(Map.Entry<Character, Integer> entry : m1.entrySet()) {
			if(entry.getValue()> max) {
				mostFrequent = entry.getKey();
				max = entry.getValue();
				
			}
			
		
		}
		
		System.out.println("the most frequent character is "+mostFrequent+ " the count is "+max);
		
	}

}
