/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class max_subseq {
	int countleft , countright , countcentre;
	static int count = 1;
	static int value[] = new int[6];
	static int maxSubarr(int arr[] , int left , int right){
		int mid = left + (right - left)/2 ; 

		if(left > right)
			return 0;
		else if(left == right)
			return arr[left];
		else {
			int left_sum = maxSubarr(arr , left , mid);
			int right_sum = maxSubarr(arr , mid+1 , right);
			int cross_sum = max_Crossarr(arr , left , right , mid);
			
			if(left_sum >= right_sum && left_sum >= cross_sum){
				if(left_sum == right_sum)
					count = count +1;
				if(left_sum == cross_sum)
					count = count +1;
				
				return left_sum;
			}
			if(right_sum >= left_sum && right_sum >= cross_sum){
				if(left_sum == right_sum)
					count = count +1;
				if(right_sum == cross_sum)
					count = count +1;
				
				return right_sum;
			}
			
			else{ 
				if(cross_sum == left_sum)
					count = count +1;
				if(cross_sum == right_sum)
					count = count +1;
				
				return cross_sum;
			}
		}
		
	}
	
	static int max_Crossarr(int[] arr, int left, int right, int mid) {
		// TODO Auto-generated method stub
		int max_left_sum = -100000;
		int max_right_sum  = -10000;
		int left_sum = 0 ;
		int right_sum = 0;
		
		for(int i=mid ; i>=0 ; i--){
			left_sum += arr[i];
			if(left_sum >= max_left_sum)
				max_left_sum = left_sum;
		}
		
		for(int i=mid+1 ; i<=right ; i++){
			right_sum += arr[i];
			if(right_sum >= max_right_sum)
				max_right_sum = right_sum;
		}
		
		return max_left_sum + max_right_sum;
	
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int test = 0;
		Scanner s = new Scanner(new File("input.txt"));
        System.out.println("Printing the file passed in:");
       	test  = s.nextInt();
       	while(test-- > 0 ){
       		int limit = s.nextInt();
       		int array[] = new int[limit];
       		for(int i=0 ; i<limit ; i++)
       			array[i] = s.nextInt();
       		
       		int result = maxSubarr(array, 0 , limit-1);
       		System.out.println("result of test " + test + " is " + result + " count is " + count);
       	}
		
		
	}

}
*/