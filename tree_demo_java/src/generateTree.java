/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class generateTree {
	
	class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; left = null; right = null; }
	     
	     private void inorder() {
	 		// TODO Auto-generated method stub
	    	 System.out.print(this);
	    	 if(this.left != null)
	 			this.left.inorder();
	 		
	 		if(this.right != null)
	 			this.right.inorder();
	 		
	 	}
	     
	    public String toString(){
	    	String s = null;
	    	s = "\t"+val + "\n";
	    	if(this.left!=null)
	    		s+=this.left.val+"\t\t" ;
	    	else
	    		s+="null\t\t";
	    	if(this.right!=null)
	    		s+= this.right.val;
	    	else
	    		s+="null";
			return s;
	    	
	    }
	}
	
    public List<TreeNode> generateTrees(int n) {
        return generateTreesUtil(1,n);
    }
    
    List<TreeNode> generateTreesUtil(int l , int h) {
        List<TreeNode> treeList = new ArrayList<TreeNode>();
        List<TreeNode> treeListLeft = new ArrayList<TreeNode>();
        List<TreeNode> treeListRight = new ArrayList<TreeNode>();
        if(h < l ){
        	treeList.add(null);
            return treeList;
        }
        if(l == h){
            TreeNode node = new TreeNode(l);
            
            treeList.add(node);
        }
        {
            for(int k = l ; k <=h ; k++){
                treeListLeft = generateTreesUtil(l,k-1);
                treeListRight = generateTreesUtil(k+1 , h);
                ListIterator<TreeNode> itleft = treeListLeft.listIterator();
                
                while(itleft.hasNext()){
                	
                	ListIterator<TreeNode> itright = treeListRight.listIterator();
                	TreeNode templeft = itleft.next();
                    while(itright.hasNext()){
                    	TreeNode node = new TreeNode(k);
                    	node.left = templeft;
                        node.right = itright.next();
                        treeList.add(node);
                    }
                }
            }
        }
        return treeList;
    }

   
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int n;
		File f = new File("src/ip.txt");
		Scanner scan = new Scanner(f);
		int test  = scan.nextInt();
		while(test>0 ){
			int size = scan.nextInt();
			generateTree t = new generateTree();
			List<TreeNode> treelist = t.generateTrees(size);
			ListIterator<TreeNode> it = treelist.listIterator();
			while(it.hasNext()){
				it.next().inorder();
				System.out.print("\n");
			}
			test--;
		}
		
		
	}

	

}

*/