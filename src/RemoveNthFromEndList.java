
public class RemoveNthFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    	ListNode p1 = head;
    	ListNode p2 = head;
    	ListNode pre = null;
    	int count = n;
    	while(p2 != null && count > 0){
    		p2 = p2.next;
    		--count;
    	}
    	if(count > 0){
    		return head;
    	}
    	while(p2 != null){
    		pre = p1;
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	if(pre == null){
    		return head.next;
    	}
    	pre.next = p1.next;
    	return head;
    }
}
