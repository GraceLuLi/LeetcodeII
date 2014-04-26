
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode p1 = head;
        while(p1 != null && p1.next != null){
        	int tmp = p1.val;
        	p1.val = p1.next.val;
        	p1.next.val = tmp;
        	p1 = p1.next.next;
        }
        return head;
    }
}
