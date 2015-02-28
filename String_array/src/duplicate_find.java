/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class duplicate_find {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 0;
		Scanner s = null;
		try {
			s = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashMap map  = new HashMap();
		
        System.out.println("Printing the file passed in:");
       	test  = s.nextInt();
       	while(test-- > 0 && s.hasNext()){
       		s.nextLine();
       		String str  = s.nextLine();
       		map.put(str.charAt(1), str);
       		for(int i = 1 ; i< str.length() ; i++){
       			if(map.put(str.charAt(i), str) != null) // nwe value
       				System.out.println("String contains duplicate values");
       		}
       		 

       	}
	}

}
*/

