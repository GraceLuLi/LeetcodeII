
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode newH = new ListNode(x-1);
        newH.next = head;
        ListNode pre1 = newH;
        ListNode p1 = head;
        while(p1 != null && p1.val < x) {
        	pre1 = p1;
        	p1 = p1.next;
        }
        ListNode pre2 = p1;
        ListNode p2 = p1;
        while(p2 != null) {
        	if(p2.val >= x) {
        		pre2 = p2;
        		p2 = p2.next;
        	}
        	else {
        		pre2.next = p2.next;
        		pre1.next = p2;
        		p2.next = p1;
        		pre1 = p2;
        		p2 = pre2.next;
        	}
        }
        return newH.next;	
    }
}
