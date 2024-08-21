package Arrays;

public class SubStrring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] patterns = { "abc" , "ab" , "a" , "d"};
		String word = "abc";
		int count =0;
		
		for (String pattern : patterns ) {
			if(word.contains(pattern)) {
				count++;
			}
		
		}
		
		System.out.println(count);

	}

}
