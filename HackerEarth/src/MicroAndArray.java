/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class MicroAndArray {
	static class SegmentTree 
	{
	    int st[]; 
	 
	    @Override
	    public String toString(){
	    	StringBuffer sb = new StringBuffer();
	    	for(int x : st){
	    		sb.append(x + " , ");
	    	}
			return sb.toString();
	    	
	    }
	    SegmentTree(int arr[], int n, int extra , int extra2)
	    {
	        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
	        int max_size = 2 * (int) Math.pow(2, x) - 1;
	        st = new int[max_size]; // Memory allocation
	        constructSTUtil(arr, 0, n - 1, 0, 0, 0);
	    }
	    int constructSTUtil(int arr[], int ss, int se, int si, int extra , int extra2)
	    {
	        if (ss == se) {
	            st[si] = arr[ss];
	            return arr[ss];
	        }
	        int mid = getMid(ss, se);
	        st[si] = Math.max(constructSTUtil(arr, ss, mid, si * 2 + 1, 0, 0) 
	        		, constructSTUtil(arr, mid + 1, se, si * 2 + 2, 0, 0));
	        return st[si];
	    }
		
	    // A utility function to get the middle index from corner indexes.
	    int getMid(int s, int e) {
	        return s + (e - s) / 2;
	    }
	
	    void updateValue(int arr[], int n, int i, int new_val, int extra , int extra2)
	    {
	        if (i < 0 || i > n - 1) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        arr[i] = new_val;
	 
	        // Update the values of nodes in segment tree
	        updateValueUtil(0, n - 1, i, new_val, 0, 0, 0);
	    }
	
	    void updateValueUtil(int ss, int se, int i, int newVal, int si, int extra , int extra2)
	    {
	        if (i < ss || i > se)
	            return;
	 
	        if(ss == se){
	    		st[si] = newVal;
	    		return ;
	    	}
	        int mid = getMid(ss, se);
	        updateValueUtil(ss, mid, i, newVal, 2 * si + 1, 0, 0);
	        updateValueUtil(mid + 1, se, i, newVal, 2 * si + 2, 0, 0);
	        st[si] = Math.max(st[2 * si + 1] , st[2 * si + 2]);
	
	    }	
	
		int getFirstHigherUtil(int ss, int se, int val , int si, int extra , int extra2)
	    {
			if(st[si] < val){
				return -1;
			}
			
			if(ss == se)
				return ss;
			
			int mid = getMid(ss, se);
			int idx1 = 0, idx2 = 0;
			if(st[2 * si + 1] >= val)
				return getFirstHigherUtil(ss, mid, val , 2 * si + 1, 0, 0);
	        else
	            return getFirstHigherUtil(mid + 1, se, val , 2 * si + 2, 0, 0);
	    }
	}
	public static void main(String args[]) {
    	
		Scanner scan = new Scanner(System.in);
		int test  = Integer.valueOf(scan.nextLine());
		
		while(test > 0){
			test--;
			int n = scan.nextInt();
			int nq = scan.nextInt();
			int[] arr = new int[n];
			for(int m=0 ; m < n ; m++)
				arr[m] = scan.nextInt();
			
			SegmentTree  tree = new SegmentTree(arr, n, 0, 0);
			for(int m=0 ; m < nq ; m++){
				int query = scan.nextInt();
				if( query == 1){
					int newVal = scan.nextInt();
					int result = tree.getFirstHigherUtil(0, n-1, newVal  , 0, 0, 0);
					if(result >=0)
						System.out.println(result+1);
					else
						System.out.println("-1");
				}
				else if(query == 0){
					int index = scan.nextInt();
					int newVal = scan.nextInt();
					tree.updateValue(arr, n, index-1, newVal, 0, 0);
				}
			}
			
		}

    }
}
*/