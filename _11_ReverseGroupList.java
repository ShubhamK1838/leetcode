https://github.com/ShubhamK1838/leetcode.git

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
    public ListNode reverseKGroup(ListNode head, int k) {
        
       return reverseHelper(head, k ); 
    }
    ListNode reverseHelper(ListNode head, int k)
    {
        if(k==1 || k==0 || head==null || head.next==null)
        {
            return head; 
        }
        int i=k-1; 
        ListNode start=head; 
        ListNode end=head; 

        while(i>0)
        {
            end=end.next; 
            if(end==null)
            {
                return head; 
            }
            i--; 
        }
        ListNode prev_head=reverseHelper(end.next,k); 
        
        reverse(start, end);
        start.next=prev_head; 

        return end; 
        
    }

    public void reverse(ListNode head, ListNode end)
    {

        ListNode prev=null; 
        ListNode cur=head; 
        ListNode nxt=head; 

        while(nxt!=end)
        {
            nxt=cur.next; 
            cur.next=prev; 
            prev=cur; 
            cur=nxt; 
        }
        cur.next=prev; 
    }
}