/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 /*
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode head1 = new ListNode();
        ListNode cur = head1;
        if(head == null)
        {
            return null;
        }
        while(head != null)
        {
            if(head.val != val)
            {
                cur.next = head;
                cur = cur.next;
            }
            head = head.next;
        }
        cur.next = null;
        return head1.next;
    }
}
*/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
 