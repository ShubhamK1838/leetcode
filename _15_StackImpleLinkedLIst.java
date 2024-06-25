public class _15_StackImpleLinkedLIst {
    


    

    public class Stack{
        Node head; 
        int len; 
    
        public Stack()
        {
            head=null; 
            len=0; 
        }
        

        public void  status()
        {
            Node h=head; 
            while(h!=null)
            {
                System.out.print(h.val+ " ") ; 
                h=h.next; 
            }
            System.out.println(); 
        }
        public int  pop()
        {
            if(isEmpty())
                return -1 ; 
            else 
            {
                int z=head.val; 
                head=head.next; 
                return z; 
            }
        }
        
        public int peek()
        {
            if(isEmpty())
                return -1; 
            else 
                return head.val; 
        }
        public void push(int val )
        {
            Node p=new Node(val); 

            if(isEmpty())
            {
                head=p; 
                
            }
            else 
            {
                p.next=head; 
                head=p; 
            }
            len++; 
        }
       
        public boolean isEmpty()
        {
            if(head==null)
                return true; 
            else    
                return false ; 
        }
    }

    public  class Node {
        int val ; 
        Node next; 
        public Node(){}; 
        public Node(int val)
        {
            this.val=val; 
        }
    }
}
