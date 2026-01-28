/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur=head;
        Set <ListNode> set = new HashSet<>();
        while(cur != null)
        {
            if(set.contains(cur))
            {
                return true;
            }
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }
}
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 慢指针走一步
            fast = fast.next.next;   // 快指针走两步
            
            // 如果快慢指针相遇，说明有环
            if (slow == fast) {
                return true;
            }
        }
        
        return false;  // 快指针到达链表末尾，说明无环
    }
}
 