
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
        	return true;
        }
        return checkSymmetric(root.left, root.right);
    }
    public boolean  checkSymmetric(TreeNode n1, TreeNode n2) {
    	if(n1 == null && n2 == null) {
    		return true;
    	}
    	if(n1 == null || n2 == null) {
    		return false;
    	}
    	if(n1.val != n2.val){
    		return false;
    	}
    	return checkSymmetric(n1.left, n2.right) && checkSymmetric(n1.right, n2.left);
    }
}
