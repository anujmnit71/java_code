import java.io.File;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.Scanner;


public class Trie<Value>{
	private static final int R = 256; // note the modifiers
	private Node root;
	private int N;
	
	private static class Node{
		private Node[] next = new Node[R];
		private Object val; 
	}
	
	public Trie(){
		N = 0;
	}
	
	public Value get(String key){
		Node x = get(root , key , 0);
		if(x != null)
			return (Value) x.val;
		else
			return null;
	}
	
	private Node get(Node x, String key, int d) {
		if(x == null)
			return null;
		if(d == key.length())
			return x;
		return get(x.next[key.charAt(d)] , key , d+1);
	}
	
	public boolean contains(String key){
		return (get(key) != null);
	}
	
	public void put(String key, Value val){
		if (val == null) 
			delete(key);
        else 
        	root = put(root, key, val, 0);
		
	}
	
	
	private Node put(Node walk , String key , Value val , int d){
		if(walk == null)
			walk = new Node();
		if(d == key.length()){
			if(walk.val == null) 
				N++;
			walk.val = val;
			return walk;
		}
		char c = key.charAt(d);
		walk.next[c] = put(walk.next[c] , key, val , d+1);
		return walk;
	}
	
	public int size(){
		return N;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public Iterable<String> keys(){
		return keysWithPrefix("");
	}
	
	private Iterable<String> keysWithPrefix(String str) {
		return null;
	}

	private void collect(Node x, StringBuilder prefix, Queue<String> results) {
		
	}
	
    public Iterable<String> keysThatMatch(String pattern) {
    	
    }
    
    private void collect(Node x, StringBuilder prefix, String pattern, Queue<String> results) {
    	
    }
    
    public String longestPrefixOf(String query) {
    	
    }
    
    private int longestPrefixOf(Node x, String query, int d, int length) {
    	
    }
    
    
	private void delete(String key) {
		
	}
    private Node delete(Node x, String key, int d) {
    	
    }
    
    
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt() ;
		
		
		// build symbol table from standard input
        Trie<Integer> st = new Trie<Integer>();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            st.put(key, i);
        }

        // print results
        if (st.size() < 100) {
            System.out.println("keys(\"\"):");
            for (String key : st.keys()) {
                System.out.println(key + " " + st.get(key));
            }
            System.out.println();
        }

        System.out.println("longestPrefixOf(\"shellsort\"):");
        System.out.println(st.longestPrefixOf("shellsort"));
        System.out.println();

        System.out.println("longestPrefixOf(\"quicksort\"):");
        System.out.println(st.longestPrefixOf("quicksort"));
        System.out.println();

        System.out.println("keysWithPrefix(\"shor\"):");
        for (String s : st.keysWithPrefix("shor"))
            System.out.println(s);
        System.out.println();

        System.out.println("keysThatMatch(\".he.l.\"):");
        for (String s : st.keysThatMatch(".he.l."))
            System.out.println(s);
		
	}
	
}