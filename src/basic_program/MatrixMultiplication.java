package basic_program;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] matrix1 = { {1,2,3} , {4,5,6} };
		int [] [] matrix2 = { {7,8} , {9,10} , {11,12} };
		
		int m1rows = matrix1.length;
		int m1colms = matrix1[0].length;
		int m2rows = matrix2.length;
		int m2colms = matrix2[0].length;
		
		if(m1colms != m2rows) {
			System.out.println("cnanot multiply matrix");
		}
		
		int [] [] result = new int [m1rows] [m2colms];
		
		for(int i =0 ; i<m1rows ; i++) {
			for (int j=0 ; j<m2colms ; j++) {
				for (int k =0 ; k<m1colms ; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		System.out.println("the result of matrix");
		for(int i=0; i<m1rows ; i++) {
			for(int j=0 ; j<m2colms ; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
