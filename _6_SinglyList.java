// https://leetcode.com/problems/design-linked-list/



/**
 * _6_SinglyList
 */
public class _6_SinglyList {

     
}
// this for leetcode 
class MyLinkedList   {

    MList list; 
    public MyLinkedList() {
        list=new MList(); 
    }
    
    public int get(int index) {
        return list.getAt(index); 
    }
    
    public void addAtHead(int val) {
        list.first(val); 
    }
    
    public void addAtTail(int val) {
        list.last(val); 
    }
    
    public void addAtIndex(int index, int val) {
        list.insert(index, val); 
    }
    
    public void deleteAtIndex(int index) {
        list.deleteAt(index); 
    }
}


// this my Implementation 
class MList{
    
    
    public Node head; 
    public int len; 
    
    public MList()
    {
        head=null; 
        len=0; 
    }
    
     public int  getAt(int ind)
    {

        if(ind>=len || ind< 0) 
        {
            return -1; 
        }
        Node n=head; 
        for(int i=0; i<ind; i++)
        {
            n=n.next; 
        }
        if(n==null) return -1; 
        return n.val; 
        
    }
  
    
    public void deleteAt(int ind )
    {
        if(ind<0 || ind>=len)
        {
            return ; 
        }else if(ind==0)
        {
            head=head.next; 
        }else 
        {
            
            Node p=head; 
            for(int i=0; i<ind-1; i++)
            {
                p=p.next; 
            }

            p.next=p.next.next; 
        }
            len--; 
    }
    public void insert(int ind , int val)
    {
        if(ind>len|| ind < 0)
        {
            return; 
        }else if(ind==0) 
        {
            first(val);
        }else  
        {
            Node p=head; 
            for(int i=0; i<ind-1; i++)
            {
                p=p.next; 
            }

            Node n=new Node(); 
            n.val=val; 
            n.next=p.next;
            p.next=n; 
            len++;  
        }
    }
    public void last(int val)
    {
        if(head==null)
        {
            first(val); 
            return; 
        }else 
        {
            Node p=head; 
            while(p.next!=null)
            {
                p=p.next; 
            }
            Node q=new Node(val, null); 
            p.next=q; 
            len++; 
        }
    }
    public void first(int val)
    {
        Node h=head; 

        if(h==null)
        {
            head=new Node(val, null); 

        }else{
            Node p=new Node(); 
            p.val=val; 
            p.next=head; 
            head=p; 

        }
        len++; 
    }


    public void status()
    {
        Node h=head; 

        while(h!=null)
        {
            System.out.print(" " + h.val); 
            h=h.next; 
        }
    }
}





class  Node{

    int val; 
    Node next; 
    
    public Node(int val)
    {
        this.val=val; 
    }
    public Node()
    {}

    public Node(int val , Node next)
    {
        this.val=val; 
        this.next=next; 
    }
    
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
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
    public static  Node reverseKGroup(Node head, int k) {
        
        if(k==1 || head.next==null || head==null)
        {
            return head; 
        }


        Node start=head; 
        Node end=head; 
        while(end!=null)
        {
            for(int i=0; i< k && end.next!=null; i++)
            {
                end=end.next; 
            }

            reverse(start, end); 
            head=end; 
           
            if(head.next!=null)
            start=head.next; 

        }

        return start; 
    }

    public static  void reverse(Node start, Node end )
    {

        if(start==end)
        {
            return ; 
        }else
        {
            Node prev=null; 
            Node cur= start; 
            Node nt=start; 
            
            while(nt.next!=end)
            {
                nt=cur.next; 
                cur.next=prev; 
                prev=cur; 
                cur=nt; 
            }
            cur.next=prev; 

            
        }
    }
}