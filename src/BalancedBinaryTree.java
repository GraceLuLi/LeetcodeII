
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
        	return true;
        }
        int leftH = Depth(root.left);
        int rightH = Depth(root.right);
        if(Math.abs(leftH - rightH) > 1){
        	return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int Depth(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	return 1 + Math.max(Depth(root.left), Depth(root.right));
    }
}
