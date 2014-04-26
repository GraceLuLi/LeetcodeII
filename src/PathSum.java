import java.util.ArrayList;

public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        Integer tmpSum = 0;
        return hasPathSum(root, sum, tmpSum);
    }
    public static boolean hasPathSum(TreeNode root, int sum, Integer tmpSum){
    	if(root == null){
    		return false;
    	}
    	tmpSum += root.val;
    	if(root.left == null && root.right == null){
    		return tmpSum == sum;
    	}

    	boolean b = hasPathSum(root.left, sum, tmpSum);
    	if(b){
    		return true;
    	}
    	b = hasPathSum(root.right, sum, tmpSum);
    	tmpSum -= root.val;
    	return b;	
    }
    public static void main(String[] args) {
    	System.out.print(hasPathSum(null, 0));
    }
}
