/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Pair<L,R> {
    private L l;
    private R r;
    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }
    public L getX(){ return l; }
    public R getY(){ return r; }
    public void setX(L l){ this.l = l; }
    public void setY(R r){ this.r = r; }
}

public class ClosestPoint {
	private static  List<Pair<Integer,Integer>> points  = new ArrayList<Pair<Integer,Integer>>();
	static List<Pair<Integer,Integer>> sortedX  = new ArrayList<Pair<Integer,Integer>>();
	static List<Pair<Integer,Integer>> sortedY  = new ArrayList<Pair<Integer,Integer>>();
	
	//static ArrayList<Integer> vy  = new ArrayList<Integer>();
	//static List<Integer> v = new ArrayList<Integer>();
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int test = 0;
		Scanner s = new Scanner(new File("input.txt"));
		
        System.out.println("Printing the file passed in:");
       	test  = s.nextInt();
       	while(test-- > 0 ){
       		int limit = s.nextInt();
       		for(int i=0 ; i<limit ; i++){
       			int x = s.nextInt();
       			int y = s.nextInt();
       			Pair<Integer,Integer> p = new Pair<Integer,Integer>(x,y);
       			points.add(p);
       			sortedX.add(p);
       			sortedY.add(p);
       			//vy.add(s.nextInt());
       		}
       		
       		Collections.sort(sortedX , new Comparator<Pair<Integer,Integer>>() {
       									public int compare(Pair<Integer,Integer> o1, Pair<Integer,Integer> o2) {
       										return Integer.compare(o1.getX(), o2.getX());}
       		});
       		
       		Collections.sort(sortedY , new Comparator<Pair<Integer,Integer>>() {
					public int compare(Pair<Integer,Integer> o1, Pair<Integer,Integer> o2) {
						return Integer.compare(o1.getY(), o2.getY());}
			});
       		
       		
       		
       		//Collections.sort(vy);
       		int result = closestPoint(sortedX , sortedY );
       		System.out.println("result of test " + test + " is " + result );
       	}
		
		
		
	}

	private static int closestPoint(List<Pair<Integer, Integer>> sortedX2 , List<Pair<Integer, Integer>> sortedY2) {
		// TODO Auto-generated method stub
		
		int length = sortedX2.size();
		if(length == 1)
			return 0;
		if(length == 2)
			return getDistance(sortedX2.get(0) , sortedX2.get(1));
		
		if(length <= 3){
//			int dist1 = getDistance(sortedX2.get(0) , sortedX2.get(1));
//			int dist2 = getDistance(sortedX2.get(1) , sortedX2.get(2));
//			int dist3 = getDistance(sortedX2.get(0) , sortedX2.get(2));
//			
			int min = 1000000;
		    for (int i = 0; i < sortedX2.size(); ++i)
		        for (int j = i+1; j < sortedX2.size(); ++j)
		            if (getDistance(sortedX2.get(i) , sortedX2.get(j) ) < min)
		                min = getDistance(sortedX2.get(i) , sortedX2.get(j));
		    return min;
		}
		
		int mid = length/2;
		Pair<Integer , Integer> midpoint = sortedX2.get(mid);
		
		ArrayList<Pair<Integer, Integer>> sortedleftY = new ArrayList<Pair<Integer, Integer>>();
		ArrayList<Pair<Integer, Integer>> sortedrightY = new ArrayList<Pair<Integer, Integer>>();
		
		//ArrayList<Pair<Integer, Integer>> pointsLeft = new ArrayList<Pair<Integer, Integer>>(points.subList(0, mid));
		//ArrayList<Pair<Integer, Integer>> pointsRight = new ArrayList<Pair<Integer, Integer>>(points.subList(mid+1, length));
		for( int i=0; i< sortedX2.size() ; i++){
			if( sortedY2.get(i).getX() <= midpoint.getX())
				sortedleftY.add(sortedY2.get(i));
			else 
				sortedrightY.add(sortedY2.get(i));
		}
		
		int leftclosest = closestPoint( sortedX2.subList(0, mid+1) , sortedleftY);
		int rightclosest = closestPoint(sortedX2.subList(mid+1, length) , sortedrightY);
		
		int d = min(leftclosest , rightclosest); 
		
		ArrayList<Pair<Integer, Integer>> strip = new ArrayList<Pair<Integer, Integer>>();
	
		
		for( int i=0 ; i< sortedY2.size() ; i++){
			if( Math.abs(sortedY2.get(i).getX() - midpoint.getX()) <= d){
				strip.add(sortedY2.get(i));
			}
		}
		
		int crossClosest = stripClosest(strip , d);
		
		int ans = min(crossClosest , d);
		return ans;
	}

	static int getDistance( Pair<Integer , Integer> a , Pair<Integer, Integer> b){
		int xdiff = a.getX() - b.getX();
		int ydiff = a.getY() - b.getY();
		int dist = (int) Math.sqrt(Math.pow(xdiff, 2) - Math.pow(ydiff, 2));
		return dist;
		
	}
	
	private static int stripClosest(ArrayList<Pair<Integer, Integer>> strip , int d) {
		// TODO Auto-generated method stub
		int min = d;
		for( int i=0 ; i< strip.size() ; i++){
			for( int m = i+1 ; m<strip.size() ; m++){
				if( Math.abs(strip.get(i).getY() - strip.get(m).getY()) < min){
					int distance = getDistance(strip.get(i) , strip.get(m));
					if( distance < min){
						min  = distance;
					}
				}
			}
		}
		return min;
	}

	private static int min(int a, int b) {
		// TODO Auto-generated method stub
		if(a<b)
			return a;
		else 
			return b;
		
	}
}
*/