import java.util.ArrayList;
import java.util.List;

public class _12_PalindromeList {
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

   
    public boolean isPalindrome(ListNode head) {
        
        List<Integer> list=new ArrayList(); 

        while(head!=null)
            {
                list.add(head.val); 
                head=head.next; 
            }

        int f=0; int e=list.size()-1; 

     
        while(f<e)
        {
           
            if(list.get(f)!=list.get(e))
            {
                return false; 
            }
            f++; 
            e--; 
        }
        return true; 
    }
}
}
