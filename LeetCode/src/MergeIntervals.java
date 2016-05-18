/*import java.io.*;
import java.util.*;

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
     @Override
     public String toString(){
		String res = "[" + start + " , " + end + "]";
		return res;
    	 
     }
}
 
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals.size() == 0)
        	return result;
        if(intervals.size() == 1){
        	result.addAll(intervals);
        	return result;
        }
        
    	Collections.sort(intervals, new Comparator<Interval>() {
        									@Override
											public int compare(Interval o1,
													Interval o2) {
												// TODO Auto-generated method stub
												return o1.start - o2.start;
											}});
        for(int p=0 ; p<intervals.size()-1 ; p++){
        	int first = p;
        	int curr_end =  intervals.get(p).end;
        	while( p < intervals.size()-1 && curr_end >= intervals.get(p+1).start){ // if overlap then merge
        		curr_end = Math.max(curr_end, intervals.get(p+1).end);
        		p++;
        	}
        	int last = p;
        	result.add(new Interval(intervals.get(first).start , curr_end));
        }
        if(result.get(result.size()-1).end < intervals.get(intervals.size()-1).start)
        	result.add(intervals.get(intervals.size()-1));
        return result;
    }
}


public class MergeIntervals{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ipLeetCode") : System.in;
		Scanner scan = new Scanner(infile);
		int test  = Integer.valueOf(scan.nextLine());
		while(test > 0){
			test--;
			int count = scan.nextInt();
			List<Interval> list = new ArrayList<Interval>();
			for(int p=0 ; p< count ;p++){
				int first = scan.nextInt();
				int second = scan.nextInt();
				list.add(new Interval(first,second));
				//System.out.println("value is " + list + ""+  list.size() );
			}
			Solution s = new Solution();
			long start = System.nanoTime();
			System.out.println(start);
			List<Interval> result = s.merge(list);
			System.out.println("solution is " + result);
			long end = System.nanoTime();
			System.out.println((end-start)/1.0e6 );
		}
	}
}
*/