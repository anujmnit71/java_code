import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Object;


class Pair<L,R> extends java.lang.Object{
	private L l;
    private R r;
    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }
    
    public L getL(){ return l; }
    
    public R getR(){ return r; }
    
    public void setL(L l){ this.l = l; }
    
    public void setR(R r){ this.r = r; }
    
    public boolean equals(Pair<?, ?> that){
    	if(this.l == that.l && this.r == that.r)
    		return true;
    	else
    		return false;
    }
    
    
    public String toString(){
    	String s = this.l + "  " + this.r + "\n";
    	return s;
    }
}

public class CountingSort4 {

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
}