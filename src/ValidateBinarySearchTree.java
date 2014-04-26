
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return checkValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean checkValid(TreeNode root, int start, int end) {
    	if(root == null) {
    		return true;
    	}
    	if(root.val <= start || root.val >= end) {
    		return false;
    	}
    	return checkValid(root.left, start, root.val) && checkValid(root.right, root.val, end);
    }
}
