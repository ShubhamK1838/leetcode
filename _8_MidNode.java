public class _8_MidNode {
    
}
// https://leetcode.com/problems/middle-of-the-linked-list/
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
    public ListNode middleNode(ListNode head) {
        

        ListNode p=head, q=head; 

        while(q!=null && q.next!=null)
        {
            p=p.next; 
            q=q.next.next; 
        }

        return p; 

        // this fist aproach 
        // int len=0; 

        // ListNode tmp=head; 

        // while(tmp!=null)
        // {
        //     tmp=tmp.next; 
        //     len++; 
        // }
        // int target=len/2; 
        // tmp=head; 
        // for(int i=0; i<target ; i++)
        // {
        //     tmp=tmp.next; 
        // }
        
        // return tmp; 
    }
}
