
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = head;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode cur;
        while(p1 != null && p2 != null){
        	if(p1.val < p2.val){
                 cur = p1;
                 p1 = p1.next;
                 cur.next = null;
        	}
        	else{
                cur = p2;
                p2 = p2.next;
                cur.next = null;
        	}
        	if(head == null){
        		head = cur;
        		tail = head;
        	}
        	else{
        		tail.next = cur;
        		tail = tail.next;
        	}
        }
        if(p1 != null){
        	if(head == null){
        		head = p1;
        	}else{
            	tail.next = p1;
        	}
        }
        if(p2 != null){
        	if(head == null){
        		head = p2;
        	}else{
            	tail.next = p2;
        	}
        }
        return head;
    }
}
