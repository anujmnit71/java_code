import java.util.*;
import java.util.Map.Entry;

class MyComp implements Comparator<String>{

	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		int l = arg0.lastIndexOf(' ');
		int m = arg1.lastIndexOf(' ');
		
		int res = arg0.substring(l+1).compareTo(arg1.substring(m+1));
		int lastname = 0;
		//if first name matches compare last name
		if(res == 0){
			return lastname = arg0.substring(0, l).compareTo(arg1.substring(0, m));
		}
		return res;
	}

}

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> balance = new TreeMap<String,Integer>(new MyComp()); // for sorted objects 
		balance.put("anuj verma", 1);
		balance.put("akhil kumar", 2);
		balance.put("cat dog", 3);
		balance.put("dog cat", 4);
		balance.put("el verma", 1);
		
		
		Set<Map.Entry<String, Integer>> sbalance = balance.entrySet();
		for ( Entry<String, Integer> v : sbalance){
			System.out.println(v);
		}
		int v = balance.get("anuj verma");
		//System.out.println(v);
		
		
	
	}

}

