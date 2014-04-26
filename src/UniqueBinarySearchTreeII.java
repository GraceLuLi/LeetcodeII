import java.util.ArrayList;

public class UniqueBinarySearchTreeII {
    public ArrayList<TreeNode> generateTrees(int n) {
         return getTrees(1, n);
    }
    public ArrayList<TreeNode> getTrees(int start, int end) {
    	ArrayList<TreeNode> res = new ArrayList<TreeNode>();
    	if(start > end) {
    		res.add(null);
    		return res;
    	}
    	for(int k = start; k <= end; ++k) {
        	ArrayList<TreeNode> lefts = getTrees(start, k - 1);
        	ArrayList<TreeNode> rights = getTrees(k + 1, end);	
        	for(int i = 0; i < lefts.size(); ++i) {
        		for(int j = 0; j < rights.size(); ++j) {
                    TreeNode root = new TreeNode(k);
        			root.left = lefts.get(i); 
        			root.right = rights.get(j);
        			res.add(root);
        		}
        	}
    	}
    	return res;
    }
}
