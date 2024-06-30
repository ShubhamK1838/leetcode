public class _21_DequeueLinkedList {




    class DQueu{
        Node front,rear;
        

        
        public void status()
        {
            Node h=front; 
            while(h!=null)
            {
                System.out.println(h.val);
                h=h.next; 

            }
        }
        public void addLast(int val )
        {
            if(front==null)
            {
                addFirat(val);
            }else{
                rear.next=new Node(val); 
                rear=rear.next; 
            }
        }
        public void addFirat(int val)
        {
            Node node=new Node(val); 
            
            if(front==null)
            {
                node.next=null; 
                front=node; 
                rear=node; 
                
            }else{
                node.next=front;
                front=node; 

            }
        }
        DQueu()
        {
            front=null; 
            rear=null; 
        }

    }
    class Node {
        Node next;
        int val; 

        public Node(int val) {this.val=val;};
        public Node(){val=-1; next=null; } 
        
    }
    
}

