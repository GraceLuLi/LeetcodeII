
public class MinimumDepth {
    public int minDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        return helper(root);
    }
    public int helper(TreeNode root){
        if(root.left == null && root.right == null){
        	return 1;
        }
        if(root.left == null){
        	return 1+helper(root.right);
        }
        if(root.right == null){
        	return 1+helper(root.left);
        }
        return 1 + Math.min(helper(root.left), helper(root.right));
    }
}
