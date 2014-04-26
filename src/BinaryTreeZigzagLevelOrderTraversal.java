import java.util.ArrayList;

public class BinaryTreeZigzagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(root == null) {
    		return res;
    	}
    	ArrayList<TreeNode> curNodes = new ArrayList<TreeNode>();
    	ArrayList<Integer> curValues = new ArrayList<Integer>();
    	curNodes.add(root);
    	curValues.add(root.val);
    	ArrayList<TreeNode> pre = curNodes;
    	int level = 1;
    	while(!pre.isEmpty()) {
    		++level;
    		res.add(new ArrayList<Integer> (curValues));
    		curNodes = new ArrayList<TreeNode>();
    		curValues = new ArrayList<Integer>();
    		for(int i = pre.size()-1; i >= 0; --i) {
    			TreeNode n = pre.get(i);
    			if(level%2 == 0) {
    				if(n.right != null) {
    					curNodes.add(n.right);
    					curValues.add(n.right.val);
    				}
    				if(n.left != null) {
    					curNodes.add(n.left);
    					curValues.add(n.left.val);
    				}
    			} else {
    				if(n.left != null) {
    					curNodes.add(n.left);
    					curValues.add(n.left.val);
    				}
    				if(n.right != null) {
    					curNodes.add(n.right);
    					curValues.add(n.right.val);
    				}
    			}
    		}
    		pre = curNodes;
    	}
    	return res;
    }
}
