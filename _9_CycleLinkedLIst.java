public class _9_CycleLinkedLIst {
    
}
// https://leetcode.com/problems/linked-list-cycle/
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
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow=head; 
        ListNode fast=head; 
       

        while(fast!=null && fast.next!=null )
        {
           
            slow=slow.next; 
            fast=fast.next.next; 
             if( fast==slow)
            {
                return true; 
            }
        }
        return false; 

    }

    public boolean first(ListNode head)
    {
        
        List<ListNode> list=new ArrayList(); 
        
        while(head!=null)
        {
            if(list.contains(head))
            {
                return true; 
            }else
            {
                list.add(head); 
                head=head.next; 
            }

        }
        return false; 
    }
}