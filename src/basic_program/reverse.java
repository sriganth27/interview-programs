package basic_program;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=128 , rev=0 , rem , temp=n;
		
		while(n!=0) {
			rem = n%10;
			rev = rev*10 + rem ;
			n = n/10;
		}
		
		System.out.println("the reverse number is "+rev);
     
		if(temp == rev) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not a palindrome");
		}
	}

}
