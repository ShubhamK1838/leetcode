// https://leetcode.com/problems/design-linked-list/

public class _7_DoublyLinkedList {

    class MyLinkedList {

        DoublyList list; 
        public MyLinkedList() {
            list=new DoublyList(); 
        }
        
        public int get(int index) {
            
            return list.get(index); 
        }
        
        public void addAtHead(int val) {
            list.insertFirst(val); 
        }
        
        public void addAtTail(int val) {
            list.insertLast(val); 
        }
        
        public void addAtIndex(int index, int val) {
            list.insertAt(index, val); 
        }
        
        public void deleteAtIndex(int index) {
            list.deleteAt(index); 
        }
    }
    
        class Node {
            int val;
            Node prev;
            Node next;
    
            public Node() {
            };
    
            public Node(int val, Node prev, Node next) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
    
        }
    
        class DoublyList {
            Node head;
            
            int len;
    
            public DoublyList() {
                head = null;
                len = 0;
            }
    
            public void deleteAt(int ind )
            {
                if(ind>=len  || ind<0 )
                {
    
                    return; 
                }else if(ind==0)
                {
                    head=head.next; 
                    if(head!=null)
                    head.prev=null; 
                }else  
                {
                    Node p=head; 
                    for(int i=0; i<ind-1; i++)
                    {
                        p=p.next; 
                    }
    
                    Node q=p.next; 
                    p.next=q.next; 
                    if(q.next!=null)
                    q.next.prev=p; 
    
                }
                len--; 
    
            }
            public void insertAt(int ind ,int val)
            {
                
                if(ind<0|| ind>len)
                {
                    return ; 
                }else if(ind==0) 
                {
                    insertFirst(val);
                }else if(ind==len) 
                {
                    insertLast(val);
                }else 
                {
                    Node p=head; 
                    for(int i=0; i<ind-1; i++)
                    {
                        p=p.next; 
                    }
                    Node node=new Node(); 
                    node.val=val; 
                    node.next=p.next; 
                    p.next.prev=node; 
                    node.prev=p; 
                    p.next=node; 
                    len++; 
                }
            }
    
            public int  get(int ind)
            {
                if(ind>=len|| ind<0) return -1; 
                
                Node p=head; 
    
                for(int i=0; i<ind; i++)
                {
                    p=p.next; 
                }
                
                return p.val; 
            }
            public void insertLast(int val)
            {
                if(head==null)
                {
                    insertFirst(val);
                    return;
                }
                Node p=head; 
                
                while(p.next!=null)
                {
                    p=p.next; 
                }
    
                Node node=new Node(); 
                node.val=val;
                node.next=null;
                node.prev=p; 
                p.next=node; 
                len++; 
            }
    
            public void insertFirst(int val) {
                if (head == null) {
                    head = new Node(val, null, null);
                } else {
                    Node p = new Node();
                    p.val = val;
                    p.prev = null;
                    p.next = head;
                    head.prev = p;
                    head = p;
                }
                len++; 
            }
    
            public void status() {
                System.out.print(" Forward :");
    
                Node p = head;
                Node pr = null;
                while (p != null) {
                    System.out.print("--> " + p.val);
                 
                    if (p.next == null) {
                        pr = p;
                    }
                    p = p.next;
                }
    
                System.out.print("\nBackward: ");
                while (pr != null) {
                    System.out.print("--> " + pr.val);
                    pr = pr.prev;
                }
            }
    
        }
    
   
}


// var o=new _7_DoublyLinkedList(); 

// var l=o.new DoublyList(); 

// l.insertFirst(10); 
// l.insertLast(20); 
// l.insertLast(30); 
// l.status(); 

