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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode cur=head.next,pre=head;
        while(cur != null)
        {
            if(cur.val == pre.val)
            {
                pre.next = cur.next;
                cur = pre.next;
            }
            else
            {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
/**
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
 */