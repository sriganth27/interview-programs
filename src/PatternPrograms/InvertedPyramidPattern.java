package PatternPrograms;

public class InvertedPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =5;
		
		for(int i=row-1 ; i>=0 ; i--) {
			for(int j=0; j<row-i-1 ; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<2*i+1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
