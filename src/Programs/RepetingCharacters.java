package Programs;
import java.util.*;
public class RepetingCharacters {

	public static void main(String[] args) {
		String str="successes";
		
		Map<Character,Integer> m1 = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			m1.put(c,m1.getOrDefault(c, 0)+1);
		}

		 List<Map.Entry<Character, Integer>> entrylist = new ArrayList<>(m1.entrySet());
		 
	     entrylist.sort((a,b) -> b.getValue().compareTo(a.getValue()));
		 
		 
		 for(Map.Entry<Character, Integer> entry : entrylist) {
			 
			 if(entry.getValue()>1) {
			 System.out.println(entry.getKey()+"-> times "+entry.getValue());
			 }
			 else {
				 System.out.println(entry.getKey()+"-> time "+entry.getValue());
			 }
			 
		 }
	}

}
