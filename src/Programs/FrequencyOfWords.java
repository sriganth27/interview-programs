package Programs;
import java.util.*;
import java.util.Map.Entry;

public class FrequencyOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hi iam sriganth sriganth is my name hi";
		str =str.toLowerCase();
		String [] words = str.split(" ");
		Map<String, Integer>  m1= new HashMap<>();
		
		for(String word : words) {
			m1.put(word, m1.getOrDefault(word, 0) +1);
			
		}
		List<Map.Entry<String, Integer> > entryList = new ArrayList<>(m1.entrySet());
		entryList.sort((a,b)->b.getValue().compareTo(a.getValue()));
		
		
		for(Map.Entry <String, Integer> entry : entryList) {
			
			System.out.println(entry.getKey()+" ->" +entry.getValue()+" time");
			
		}
	}

}
