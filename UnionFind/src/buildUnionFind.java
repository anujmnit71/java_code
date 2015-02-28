import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Vertex{
	int id;
	int rank;
	Vertex parent;
	
	Vertex(){
		this.id = -1;
		this.rank = -1;
		this.parent = null;
	}
	
	Vertex(int id){
		this.id = id;
		this.rank = 1;
		this.parent = this;
	}
	
}


class UnionFind{
	Vertex[] vlist;
	
	UnionFind(int n){
		vlist = new Vertex[n];
		for(int i=0 ; i<n ; i++){
			vlist[i] = new Vertex(i);
		}
		
	}

	void makeSet(int n){
		for(int i=0 ; i<n ; i++){
			vlist[i] = new Vertex(i);
		}
		
	}
	
	Vertex findSet(Vertex v_curr){
		//ArrayList<Vertex> vl = new ArrayList<Vertex>(); not required 
		if(v_curr.parent.id != v_curr.id){
			//vl.add(v_curr);
			v_curr.parent = findSet(v_curr.parent);
		}
		
		return v_curr.parent;
	}
	
	
	Vertex makeUnion(Vertex  v1 , Vertex v2){
		if(findSet(v1).id == findSet(v2).id)
			return v1.parent;
		
		Vertex v1_root = findSet(v1);
		Vertex v2_root = findSet(v2);
		Vertex root = null;
		
		if(v1_root.rank > v2_root.rank){
			v2_root.parent = v1_root;
			root = v1_root;
		}
		
		if(v1_root.rank < v2_root.rank){
			v1_root.parent = v2_root;
			root = v2_root;
		}
		
		
		if(v1_root.rank == v2_root.rank){
			v1_root.rank = v2_root.rank = v2_root.rank + 1;
			v2_root.parent = v1_root;
			root = v1_root;
		}
		return root;
		
	}

	void getPath(Vertex v){
		while(v.id != v.parent.id){
			System.out.println(v.id);
			v = v.parent;
		}
		System.out.println(v.id);
	}
}


public class buildUnionFind{
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt() ;
		int test2 = test;
		int half = test/2;
		
		UnionFind myset = new UnionFind(test);
		myset.makeSet(myset.vlist.length);
		
		while(test>half ){
			int a = scan.nextInt();
			int b = scan.nextInt();
			Vertex parent = myset.makeUnion(myset.vlist[a] , myset.vlist[b]);
			System.out.println("Parent is " + parent.id + " rank is " + parent.rank);
			test--;
		}
		while(test > 0){
			int a = scan.nextInt();
			Vertex parent = myset.findSet(myset.vlist[a]);
			System.out.println("Parent is " + parent.id + " rank is " + parent.rank);
			test--;
		}	
		
		System.out.println("Path length to root ");
		for(int i=0 ; i < test2 ; i++){
			System.out.println("Paht of vertex " + i);
			Vertex  v= myset.vlist[i];
			myset.getPath(v);
		}
		
	}
	
}