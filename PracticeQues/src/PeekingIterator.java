import java.io.*;
import java.util.Scanner;
public class PeekingIterator 
{ 
    public static int landingPosition(int[] input1,String[] input2)
    {
        //Write code here
    	int N = input1[0];
    	int M = input1[1];
    	
    	if(input2.length != N || input2[0].length() != 2*M - 1)
    		return -1;
    		
    	/*for(int i = 0 ; i < N ; i++){
    		for(int j = 0 ; j < M ; j++){
    			String temp
    		}
    	}*/
    	int[][] sizetable = new int[N][M];
    	
    	
    	int maxval = -100;
    	
    	for(int col = M-1 ; col >=0 ; col--){
    		for(int row = 0 ; row < N ; row++){
    			if(input2[row].charAt(col) == 'o'){
    				if(col == M-1 || row == 0){
    					sizetable[row][col] = 1;
    					continue;
    				}
    				int minval = Math.min(Math.min(sizetable[row-1][col] , sizetable[row][col+1]) , sizetable[row-1][col+1]);
    				
  					sizetable[row][col] = 1 + minval;
    			}
    			else{
    				sizetable[row][col] = 0;
    			}
    			if(maxval < sizetable[row][col])
    				maxval = sizetable[row][col];
    		}
    		
    	}
    	
    	return maxval;
        
    }
    
    public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt() ;
		int[] input1 = new int[2];
		int n = 3;
		int m = 3;
		input1[0] = n;
		input1[1] = m;
		String[] input2 = new String[n];
		input2[0] = "xoo";
		input2[1] = "ooo";
		input2[2] = "xxo";
		
		//while(test > 0){
			//String str;
			//str = scan.nextLine();
			System.out.println(PeekingIterator.landingPosition(input1, input2));
			//test--;
		//}
	}
	
}

