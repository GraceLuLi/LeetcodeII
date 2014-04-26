
public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
         return sortedArrayToBST(num, 0, num.length-1);
    }
    
    public TreeNode sortedArrayToBST(int[] num, int start, int end){
    	if(start > end){
    		return null;
    	}
    	if(start == end){
    		return new TreeNode(num[start]);
    	}
    	int mid = (start+end)/2;
    	TreeNode n = new TreeNode(num[mid]);
    	n.left = sortedArrayToBST(num, start, mid - 1);
    	n.right = sortedArrayToBST(num, mid+1, end);
    	return n;
    }
}
