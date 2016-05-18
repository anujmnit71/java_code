/*import java.io.*;
import java.util.*;

class Solution {
    
	public void rotateMatrix(int[][] matrix, int times) {
		// TODO Auto-generated method stub
		int m = matrix.length;
		int n = matrix[0].length;
		
		int row = 0;
		int col = 0;
		int TotalLen = ( m + n)*2 - 4;
		
		int nLayers = Math.min(m, n)/2;
		
		for(int i=0 ; i<nLayers ; i++){
			int newtimes = times%TotalLen;
			for(int k=0 ; k< newtimes ; k++)
				rotateMatrixOnce(matrix , row , col , m , n);
			TotalLen = TotalLen - 8;
			row++;col++;m--;n--;
		}
	}

	private void rotateMatrixOnce(int[][] matrix, int row, int col, int m, int n) {
		int prev, curr;

		int r1c1 = matrix[row][col];
		int r1cn = matrix[row][n-1];
		int rmc1 = matrix[m-1][col];
		int rmcn = matrix[m-1][n-1];
		
        //top 
        for (int i = col; i < n-1; i++)
            matrix[row][i] = matrix[row][i+1];

        //bottom
        for (int i = n-1; i > col; i--)
        	matrix[m-1][i] = matrix[m-1][i-1];
        
        //left
        for (int i = m-1; i > row; i--)
            matrix[i][col] = matrix[i-1][col];

        matrix[row+1][col] = r1c1;

        //right
        for (int i = row; i < m-1; i++)
            matrix[i][n-1] = matrix[i+1][n-1];

        matrix[m-2][n-1] = rmcn;
	}
}

public class MatrixRotate{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ip.txt") : System.in;
		Scanner scan = new Scanner(infile);
		int test  = Integer.valueOf(scan.nextLine());
		while(test > 0){
			test--;
			int row = scan.nextInt();
			int col = scan.nextInt();
			int times = scan.nextInt();
			int[][] matrix = new int[row][col];
			for(int p=0 ; p<row ;p++){
				for(int q=0 ; q<col ; q++){
					matrix[p][q] = scan.nextInt();
				}
			}
			
			//System.out.println("value is " + list + ""+  list.size() );
			Solution s = new Solution();
			long start = System.nanoTime();
			//System.out.println(start);
			s.rotateMatrix(matrix, times);
			long end = System.nanoTime();
			//System.out.println((end-start)/1.0e6 );
			for(int p=0 ; p<row ;p++){
				for(int q=0 ; q<col ; q++){
					System.out.print(matrix[p][q] + " ");
				}
				System.out.println();
			}
		}
			
	}
}
*/