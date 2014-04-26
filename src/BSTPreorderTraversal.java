import java.util.ArrayList;
import java.util.Stack;

public class BSTPreorderTraversal {
	// Method 1, according to question, recursive solution is trivial
	// using Stack
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> s = new Stack<TreeNode>();
    	while(!s.isEmpty() || root != null){
    		 if(root != null){
    			 res.add(root.val);
    			 if(root.right != null){
    				 s.push(root.right);
    			 }
    			 root = root.left;
    		 }
    		 else{
    			 root = s.pop();
    		 }
    	}
    	return res;
    }
	
	// Method 2 using recursive
	/*
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	preorderTraversal(root, result);
    	return result;
    }
    public void preorderTraversal(TreeNode root, ArrayList<Integer> re) {
    	if(root == null){
    		return;
    	}
    	re.add(root.val);
    	preorderTraversal(root.left, re);
    	preorderTraversal(root.right, re);
    }*/
}
