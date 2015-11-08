import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class MatrixDispute{
	private static int rowWise(int[][] matrix , int row , int col){
		int[][] rightSum = new int[row][col];
		for(int r = 0 ; r < row ; r++){
			rightSum[r][col-1] = matrix[r][col-1];
		}
		
		for(int c = col-2 ; c >=0 ; c-- ){
			for(int r = 0 ; r < row ; r++){
				if(matrix[r][c] == 1)
					rightSum[r][c] = rightSum[r][c+1] + 1;
				else
					rightSum[r][c] = 0;
			}
		}
		int max_val = 0;
		for(int c = 0 ; c < col ; c++){
			int[] temp = new int[row];
			for(int r = 0 ; r < row ; r++){
				temp[r] = rightSum[r][c];
			}
			Arrays.sort(temp);
			for(int i = 0 ; i < row ;  i++){
				max_val = Math.max(max_val, temp[i]*(row - i));
			}
		}
		return max_val;
	}
	
	private static int colWise(int[][] matrix , int row , int col){
		int[][] downSum = new int[row][col];
		for(int c = 0 ; c < col ; c++){
			downSum[row-1][c] = matrix[row-1][c];
		}
		
		for(int r = row-2 ; r >=0 ; r-- ){
			for(int c = 0 ; c < col ; c++){
				if(matrix[r][c] == 1)
					downSum[r][c] = downSum[r+1][c] + 1;
				else
					downSum[r][c] = 0;
			}
		}
		
		int max_val = 0;
		for(int r = 0 ; r < row ; r++){
			int[] temp = new int[col];
			for(int c = 0 ; c < col ; c++){
				temp[c] = downSum[r][c];
			}
			Arrays.sort(temp);
			for(int i = 0 ; i < col ;  i++){
				max_val = Math.max(max_val, temp[i]*(col - i));
			}
		}
		return max_val;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt() ;
		
		while(test > 0 ){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int[][] matrix = new int[a][b];
			scan.nextLine();
			for(int row = 0 ; row < a ; row++){
				String line = scan.nextLine();
				int col = 0;
				for( char c : line.toCharArray()){
					matrix[row][col] = c - '0';
					col++;
				}
			}

			System.out.println("Row wise is " + rowWise(matrix, a , b) + " col wise is " + colWise(matrix , a, b));
			test--;
		}		
	}
	
}