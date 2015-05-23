/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Object;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        
        Collections.sort(intervals , new Comparator<Interval>(){
                public int compare(Interval first , Interval second){
                   return first.start - second.start; 
                }

            });
            
        List<Interval> newList = new ArrayList<Interval>(); 
        for(int i = 0 ; i < intervals.size() -1 ; i++){
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            while(i < intervals.size() -1 && intervals.get(i).end >= intervals.get(i+1).start)
                i++;
            end = intervals.get(i).end;
            newList.add(new Interval(start,end));
        }
        return newList;
        
    }
}


public class mergeInterval {

    public static void main(String[] args) {
         //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner s = new Scanner(System.in);
        int sizearr = s.nextInt();
        List<Pair<Integer, String> > pairList = new ArrayList<Pair<Integer , String> >();
        for(int i = 0 ; i < sizearr ; i++){
        	Pair<Integer, String> p = new Pair<Integer, String>(s.nextInt() , s.next());
        	pairList.add(p);
        }
        
        Collections.sort(pairList, new Comparator<Pair<Integer , String>>(){
        	public int compare( Pair<Integer , String> first , Pair<Integer , String> second){
        		Integer firstInt = first.getL();
        		Integer secondInt = second.getL();
        		return firstInt.compareTo(secondInt);
        	}
		});
        
    }
}*/