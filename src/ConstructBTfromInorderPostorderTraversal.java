
public class ConstructBTfromInorderPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	int len = inorder.length;
        return build(inorder, 0, len-1, postorder, 0, len-1);
    }
    
    public TreeNode build(int[] inorder, int s1, int e1, int[] postorder, int s2, int e2) {
    	
    	if(s1 > e1 || s2 > e2) {
    		return null;
    	}
    	
    	TreeNode root = new TreeNode(postorder[e2]);
    	int mid1 = s1;
    	for(mid1 = s1; mid1 <= e1; ++mid1) {
    		if(inorder[mid1] == root.val) {
    			break;
    		}
    	}
    	int offset = mid1 - 1 - s1;
    	root.left = build(inorder, s1, mid1-1, postorder, s2, s2 + offset);
    	root.right = build(inorder, mid1+1, e1, postorder, s2 + offset+1, e2-1);
    	return root;
    }
}
