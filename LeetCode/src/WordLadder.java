/*import java.io.*;
import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        int len = beginWord.length();
        queue.add("##");
        
        int count=0;
        while(queue.peek() != null){
            if(queue.peek().equals("##") ){
            	if(queue.size() == 1)
            		return 0;
            	queue.remove();
            	count++;
            	queue.add("##");
            }

            StringBuffer currWord = new StringBuffer(queue.remove());
            for(int p=0 ; p<len ;p++){
            	StringBuffer TempWord = new StringBuffer(currWord);
            	for(char ch='a' ; ch<='z' ; ch++){
                	TempWord.setCharAt(p,ch);
                    if(TempWord.toString().equals(endWord) == true)
                        return count+2;
                    if(wordList.contains(TempWord.toString()) == true && TempWord.toString().equals(currWord.toString()) != true){
                    	wordList.remove(TempWord.toString());
                        queue.add(TempWord.toString());
                    }
                }
            }
            
        }
        return 0;
    }
}
public class WordLadder{
	public static void main(String[] args) throws FileNotFoundException{
		final boolean FROM_FILE = true;
		InputStream infile = FROM_FILE?new FileInputStream("src/ipLeetCode") : System.in;
		Scanner scan = new Scanner(infile);
		int test  = Integer.valueOf(scan.nextLine());
		while(test > 0){
			test--;
			String BeginWord = scan.nextLine();
			String EndWord = scan.nextLine();
			String str = scan.nextLine();
			Set<String> list = new HashSet<String>(Arrays.asList(str.split(",")));
			//System.out.println("value is " + list + ""+  list.size() );
			Solution s = new Solution();
			long start = System.nanoTime();
			System.out.println(start);
			System.out.println("solution is " + s.ladderLength(BeginWord, EndWord, list));
			long end = System.nanoTime();
			System.out.println((end-start)/1.0e6 );
		}
			
	}
}
*/