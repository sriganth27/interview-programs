package basic_program;

public class Fibinoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10 ;
		int firstTerm = 0, secondTerm =1 , nextTerm;
		System.out.println("the fibinoci series upto "+n );
		for(int i =1 ; i<=n ; i++) {
			System.out.print(firstTerm+ " , ");
			nextTerm = firstTerm + secondTerm ;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
