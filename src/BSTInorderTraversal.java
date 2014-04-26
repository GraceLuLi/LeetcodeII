import java.util.ArrayList;
import java.util.Stack;

public class BSTInorderTraversal {
	//Method 1 recursive is trivial, using Stack
	
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(!s.isEmpty() || root != null){
        	if(root != null){
        		s.push(root);
        		root = root.left;
        	}
        	else{
        		root = s.pop();
        		res.add(root.val);
        		root = root.right;
        	}
        }
        return res;
    }
	// Method 2 using recursive
	/*
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	inorderTraversal(root, result);
    	return result;
    }
    public void inorderTraversal(TreeNode root, ArrayList<Integer> re){
    	if(root == null){
    		return;
    	}
    	inorderTraversal(root.left, re);
    	re.add(root.val);
    	inorderTraversal(root.right, re);
    }*/
}
