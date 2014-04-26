
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newH = new ListNode(-1);
        newH.next = head;
        ListNode pre = newH;
        ListNode p1 = head;
        int i = 1;
        while(i < m) {
        	pre = p1;
        	p1 = p1.next;
        	++i;
        }
        ListNode p2 = p1;
        while(i < n) {
        	p2 = p2.next;
        	++i;
        }
        ListNode next = p2.next;
        pre.next = null;
        p2.next = null;
        ListNode tmpH = p1;
        ListNode tmp = p1;
        while(p1 != null && p1.next != null) {
        	tmp = p1.next;
        	p1.next = tmp.next;
        	tmp.next = tmpH;
        	tmpH = tmp;
        }
        pre.next = tmpH;
        p1.next = next;
        return newH.next;     
    }
}
