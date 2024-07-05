package basic_program;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=153 , sum = 0 , rem , temp = n;
		
		while (n>0) {
			rem = n%10;
			sum = sum+ rem*rem*rem;
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println("armstromg number");
			
		}
		else {
			System.out.println("not a armstromg number");
		}
	}

}
