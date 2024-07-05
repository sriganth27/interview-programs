package basic_program;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels = 0 , digit =0 ,  consonent = 0, spaces =0 ;
		String str = "hi iam sriganth 2345";
		str = str.toLowerCase();
		
		for(int i =1 ; i <str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'a' || ch =='e' || ch =='i' || ch=='o' || ch=='u' ) {
				
				++vowels;
			}
			
			else if (ch>='0' && ch<='9') {
				++digit;
			}
			
			else if (ch >= 'a' && ch <= 'z') {
				++consonent;
			}
			
			else if(ch==' ') {
				++spaces;
				
			}
			
			
		}
   System.out.println("vowels"+vowels);
   System.out.println(digit);
   System.out.println(consonent);
   System.out.println("space"+spaces);
	}

}
