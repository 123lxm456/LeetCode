/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA,curB;
        curA=headA;
        if(headA==null || headB==null)
        {
            return null;
        }
        while(curA != null)
        {
            curB=headB;
            while(curB!=null)
            {
                if(curA != curB)
                {
                    curB=curB.next;
                }
                else
                {
                    return curB;
                }
            }
            curA=curA.next;
        }
        return null;
    }
}
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp != null)
        {
            set.add(temp);
            temp = temp.next;
        }
        temp=headB;
        while(temp != null)
        {
            if(set.contains(temp))
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}