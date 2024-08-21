package Programs;
import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "silent";
		String str2 = "listen";
		
		Map<Character ,Integer> m1 = new HashMap<>();
		Map<Character ,Integer> m2 = new HashMap<>();
		
		for(char c :str1.toCharArray()) {
			m1.put(c, m1.getOrDefault(c,0)+1);
			
		}
		for(char c :str2.toCharArray()) {
			m2.put(c, m2.getOrDefault(c,0)+1);
			
		}
		
		
		if(m1.equals(m2)) {
			System.out.println(str1+ " and "+str2+" are anagram ");
		}
		
		else {
			System.out.println("Strings are not anagram");
		}
		
		
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println(str1+ " and "+str2+" are anagram ");
		}
		
		else {
			System.out.println("Strings are not anagram");
		}
	}

}
