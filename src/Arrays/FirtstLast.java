package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FirtstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1 = new ArrayList<>();
		
		a1.add("apple");
		a1.add("banana");
		a1.add("grapes");
		a1.add("guva");
		a1.add("orange");
		
		
		if(!a1.isEmpty()) {
			String first = a1.get(0);
			String last = a1.get(a1.size()-1);
			System.out.println("First element :"+first);
			System.out.println("Second element :"+last);

		}
		
		
	}

}
