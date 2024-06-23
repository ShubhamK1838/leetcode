public class _13_MergeList {
    // https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        

        if(list1==null) return list2; 
        if(list2==null) return list1; 

        if(list1.val<list2.val)
        {
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;  
        }else 
        {
            list2.next=mergeTwoLists(list1, list2.next); 
            return list2; 
        }
        // if(list1==null && list2==null) return null; 
        // ListNode head=new ListNode(), tmp; 

        // tmp=head; 

        // while(list1!=null && list2!=null)
        // {
            
        //     if(list1.val<list2.val)
        //     {
        //         tmp.val=list1.val; 
        //         list1=list1.next; 
        //     }else
        //     {
        //         tmp.val=list2.val; 
        //         list2=list2.next; 
        //     }

        //     tmp.next=new ListNode(); 
        //     tmp=tmp.next; 
            
        // }

        // while(list1!=null)
        // {
        //     tmp.val=list1.val; 
            
        //     list1=list1.next; 
        //     if(list1!=null) 
        //     {
        //         tmp.next=new ListNode(); 
        //         tmp=tmp.next; 
        //     }
        // }

        // while(list2!=null)
        // {
        //     tmp.val=list2.val; 
        //     list2=list2.next; 
        //     if(list2!=null)
        //     {
        //         tmp.next=new ListNode(); 
        //         tmp=tmp.next; 
        //     }
        // }

        // return head; 

    }
}
}
