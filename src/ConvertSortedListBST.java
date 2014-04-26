
public class ConvertSortedListBST {
	ListNode h;
	 public TreeNode sortedListToBST(ListNode head) {
		 h = head;
	      int len = 0;
	      ListNode p = head;
	      while(p != null) {
	    	  ++len;
	    	  p = p.next;
	      }
	      return toBST(0, len-1);
	 }
	 public TreeNode toBST(int start, int end) {
		 if(start > end) {
			 return null;
		 }
		 int mid  = (start + end)/2;
		 TreeNode left = toBST(start, mid-1);
		 TreeNode root = new TreeNode(h.val);
		 h = h.next;
		 root.left = left;
		 root.right = toBST(mid+1, end);
		 return root;
	 }
}
