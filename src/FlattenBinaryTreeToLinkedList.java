
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
         flattenNode(root);
    }
    
    public TreeNode flattenNode(TreeNode root) {
    	if(root == null) {
    		return null;
    	}
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode p = root;
        p.left = null;
        if(left != null) {  	
        	TreeNode leftEnd = flattenNode(left);
        	p.right = left;
        	p = leftEnd;
        }
        if(right != null) {
        	TreeNode rightEnd = flattenNode(right);
        	p.right = right;
        	p = rightEnd;
        }
    	return p;
    }
}
