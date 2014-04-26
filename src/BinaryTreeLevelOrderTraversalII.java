import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversalII {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	if(root == null){
    		return res;
    	}
        ArrayList<TreeNode> curNodes = new ArrayList<TreeNode>();
        ArrayList<Integer> curValues = new ArrayList<Integer>();
        curNodes.add(root);
        curValues.add(root.val);
        ArrayList<TreeNode> preNodes = curNodes;
        while(preNodes.size() != 0) {
        	res.add(0,curValues);
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
        	}
        	preNodes = curNodes;
        }
        return res;
    }
}
