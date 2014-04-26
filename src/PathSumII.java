import java.util.ArrayList;

public class PathSumII {
    public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> tmpList = new ArrayList<Integer>();
    	Helper(root, sum, 0, tmpList, res);
    	return res;
    }
    public static void Helper(TreeNode node, int sum, int tmp, ArrayList<Integer> tmpList, ArrayList<ArrayList<Integer>> res) {
    	if(node == null){
    		return;
    	}
		tmpList.add(node.val);
		tmp += node.val;
    	if(node.left == null && node.right == null){
    		if(tmp == sum){
    			res.add(new ArrayList<Integer> (tmpList));
    		}
    	}
    	if(node.left != null){
    		Helper(node.left, sum, tmp, tmpList, res);
    	}
    	if(node.right != null){
    		Helper(node.right, sum, tmp, tmpList, res);
    	}

    	tmp -= node.val;
    	tmpList.remove(tmpList.size()-1);
    }
    public static void main(String[] args) {
    	TreeNode n1 = new TreeNode(0);
    	TreeNode n2 = new TreeNode(1);
    	TreeNode n3 = new TreeNode(1);
    	n1.left = n2; n1.right = n3;
    	ArrayList<ArrayList<Integer>> res = pathSum(n1, 0);
    }
}
