import java.util.Scanner;

/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class KMPplus {
    private String pattern;
    private int[] next;

    // create Knuth-Morris-Pratt NFA from pattern
    public KMPplus(String pattern) {
        this.pattern = pattern;
        int M = pattern.length();
        int i =0;
        next = new int[M];
        int j = next[0] = -1;
        while(i < M-1) {
            if (i == 0)                                      
            	next[i] = -1;
            else if (pattern.charAt(i) != pattern.charAt(j)) // this is to ensure that the followed character is different from the
            	next[i] = j;								// unmatched one 
            else
            	next[i] = next[j];							// else set next to previous next 
            while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j];
            }
            j++;
        	
        	// pattern.charAt(i) != pattern.charAt(j)
        	//this is to ensure that the followed character is different from the unmatched one
        	
        	while (j > -1 && pattern.charAt(i) != pattern.charAt(j))
                j = next[j];
             i++;
             j++;
             if (pattern.charAt(i) == pattern.charAt(j))
            	 next[i] = next[j];
             else
            	 next[i] = j;
        }

        for (int k = 0; k < M; k++)
            System.out.println("next[" + k + "] = " + next[k]);
    }

    // return offset of first occurrence of text in pattern (or N if no match)
    // simulate the NFA to find match
    public int search(String text) {
        int M = pattern.length();
        int N = text.length();
        int i, j;
        for (i = 0, j = 0; i < N && j < M; i++) {
            while (j >= 0 && text.charAt(i) != pattern.charAt(j))
                j = next[j];
            j++;
        }
        if (j == M) 
        	return i - M;
        return N;
    }


    // test client
    public static void main(String[] args) throws FileNotFoundException {
    	File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		scan.nextLine();
    	while(test-- > 0){
	    	String pattern = scan.nextLine();
	        String text    = scan.nextLine();
	        
	        int M = pattern.length();
	        int N = text.length();
	
	        // substring search
	        KMPplus kmp = new KMPplus(pattern);
	        int offset = kmp.search(text);
	
	        // print results
	        System.out.println("M = " + M + ", N = " + N);
	        System.out.println("text:    " + text);
	        System.out.print("pattern: ");
	        for (int i = 0; i < offset; i++)
	            System.out.print(" ");
	        System.out.println(pattern);
    	}
    }

}*/


/*  Recursion example: creating anagrams

An anagram is a type of word play, the result of rearranging the
letters of a word or phrase to produce other words, using all the
original letters exactly once.

This is a class that asks the user to enter a string and prints out
all anagrams of that string, that is, all possible orderings
(permutations), of the letters in the string. For example, the
anagrams of "abc" are: abc, acb, bac, bca, cab, cba.

The main method is makeAnagram() which is recursive. It works as follows:
put every character in the string as first letter, and recursively find all 
anagrams of the remaining letters. 

Laura Toma, csci107
*/
public class KMPplus {
	
	public static void main (String args[]) {
		
		Scanner r = new Scanner(System.in);
		//Read a string from the user
		System.out.print("Enter a string:"); 
		String s = r.nextLine(); 
		

		//We convert the string to an array of characters. Basically
		//we want to freely change the letters in the string, and this
		//is not possible with class String, and is too cumbersome
		//with class StringBuffer.
		char[] text = new char[s.length()]; 
		for (int i=0; i<s.length(); i++) text[i] = s.charAt(i);
				
		System.out.println("Here are all the anagrams of " + s);
		makeAnagram(text, 0); 
		System.out.println("Goodbye!");
	} // end of main

	/* This method prints all anagrams of a obtained by leaving the first 
	   i characters unchanged and going through all possible orderings of 
	   characters i and beyond. For example:
	   makeAnagram("abc", 1) prints out abc acb 
	   makeAnagram("abc", 0) prints out abc acb bac bca cab cba
	   makeAnagram("abcd", 2) prints out abcd abdc
	*/
	static void makeAnagram(char[] a, int i) {
		//System.out.println("MakeAnagram i=" + i); //for debug
		if (i == a.length-1)  printArray(a);
		else {
			for (int j=i; j< a.length; j++) {
				//swap a[i] with a[j]
				char c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				makeAnagram(a, i+1);
				//swap back
				c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
			}
		}
	}//end of makeAnagram
	
	//print an array
	static void printArray(char [] a) {
		for (int i=0; i< a.length; i++) System.out.print(a[i]); 
		System.out.println();
	} //end of printArray	
} // end of class
