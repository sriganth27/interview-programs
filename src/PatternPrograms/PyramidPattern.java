package PatternPrograms;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row = 5;
        
        for(int i=0; i<row ; i++) {
        	for(int j=0 ; j<row-i-1; j++) {
        		System.out.print(" ");
        	}
        	
        	for(int k =0 ; k<2*i+1; k++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }
	}

}
