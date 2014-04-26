
public class RemoveDuplicatesfromSortedArray {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
    	ListNode pre = head;
    	ListNode cur = head.next;
    	
    	while(cur != null){
    		while(cur != null && cur.val == pre.val){
    			cur = cur.next;
    		}
    		pre.next = cur;
    		pre = cur;
            cur =  (cur == null ? null : cur.next);
    	}
    	return head;
    }
}
