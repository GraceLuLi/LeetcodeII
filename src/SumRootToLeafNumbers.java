
public class SumRootToLeafNumbers {
	int sum = 0;
    public int sumNumbers(TreeNode root) {
        Helper(root, 0);
        return sum;
    }
    public void Helper(TreeNode root, int num) {
    	if(root == null){
    		return;
    	}
    	num = num*10 + root.val;
    	if(root.left == null && root.right == null){	
    		sum += num;
    	}
    	if(root.left != null){
    		Helper(root.left, num);
    	}
    	if(root.right != null) {
    		Helper(root.right, num);
    	}
    }
}
