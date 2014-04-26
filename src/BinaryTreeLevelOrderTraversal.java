import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(root == null) {
    		return res;
    	}
    	ArrayList<TreeNode> preNodes;
    	ArrayList<TreeNode> curNodes = new ArrayList<TreeNode>();
    	ArrayList<Integer> curValues = new ArrayList<Integer>();
    	curNodes.add(root);
    	curValues.add(root.val);
    	preNodes = curNodes;
    	while(!preNodes.isEmpty()){
    		res.add(curValues);
    		curNodes = new ArrayList<TreeNode>();
    		curValues = new ArrayList<Integer>();
    		for(TreeNode n : preNodes){
    			if(n.left != null){
    				curNodes.add(n.left);
    				curValues.add(n.left.val);
    			}
    			if(n.right != null){
    				curNodes.add(n.right);
    				curValues.add(n.right.val);
    			}
    			preNodes = curNodes;
    		}
    	}
    	return res;
    }
}
