package Programs;
import java.util.*;
public class FindNonRepetingCharacter {

	public static void main(String[] args) {
		// TODO Autopublic static void main(String[] args) {
        // Sample input string
        String str = "swiss";
        
        // Create a Map to store the frequency of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to a character array and iterate through it
       for(char c : str.toCharArray()) {
    	   charCountMap.put(c, charCountMap.getOrDefault(c,0) +1);
       }
       
       for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
    	   
    	   if(entry.getValue()==1) {
    		   System.out.println("first non-repeated character is "+entry.getKey());
    		   return;
    	   }
    	   else {
    		   System.out.println("No non-repeated character found.");
    	   }
    	   
    	   
    	    
    	  
       }
        // If no non-repeated character is found
        
    }

	}


