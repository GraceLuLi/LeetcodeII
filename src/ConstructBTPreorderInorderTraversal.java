
public class ConstructBTPreorderInorderTraversal {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return build(preorder, 0, len-1, inorder, 0, len-1);
    }
    public static TreeNode build(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2) {
    	if(s1 > e1 || s2 > e2) {
    		return null;
    	}
    	TreeNode root = new TreeNode(preorder[s1]);
    	int mid2 = s2;
    	while(mid2 <= e2) {
    		if(inorder[mid2] == root.val) {
    			break;
    		}
    		++mid2;
    	}
    	int offset = mid2 -1 - s2;
    	root.left = build(preorder, s1+1, s1+1+offset, inorder, s2, mid2-1);
    	root.right = build(preorder, s1+1+offset+1, e1, inorder, mid2+1, e2);
    	return root;
    }
    public static void main(String[] args) {
    	int[] preorder = new int[]{1,2};
    	int[] inorder = new int[]{2,1};
    	buildTree(preorder, inorder);
    }
}
