import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> s = new Stack<TreeNode>();
    	if(root == null){
    		return res;
    	}
    	s.push(root);
    	TreeNode cur;
    	while(!s.isEmpty()){
    		cur = s.pop();
    		res.add(0, cur.val);
    		if(cur.left != null){
    			s.push(cur.left);
    		}
    		if(cur.right != null){
    			s.push(cur.right);
    		}
    	}
    	return res;  		
    }
}
