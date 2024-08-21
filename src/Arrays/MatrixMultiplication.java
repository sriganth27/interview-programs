package Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix1 = { {1,2,3} , {4,5,6} , {7,8,9}};
		int [] [] matrix2 = { {1,2} , {3,4} , {5,6}};
		
		
		int m1row= matrix1.length;
		int m1col= matrix1[0].length;
		int m2row=matrix2.length;
		int m2col= matrix2[0].length;
		
		int [][]  result = new int [m1row][m2col];
		
		if(m1row == m2col) {
			System.out.println("can not multiply matrix");
			
		}
		
		for(int i =0 ; i<m1row; i++) {
			for(int j=0 ; j<m2col ; j++) {
				for(int k=0; k<m1col ; k++) {
					result [i][j] += matrix1[i][k] * matrix2[k][j];
				}
				
			}
		}
		
		for(int i =0 ; i<m1row; i++) {
			for(int j=0 ; j<m2col ; j++) {
				
				System.out.print(result[i][j]+" ");
			}
			
			System.out.println();
			}

	}

}
