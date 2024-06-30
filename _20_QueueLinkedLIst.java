public class _20_QueueLinkedLIst {


    
    
}

class node  {
    node next; 
    int val; 
    node()
    {
       next=null;  
    }
}
class QueueList{
    node head,rear; 
    
    
    public int remove()
    {
        if(head==null && rear==null)
        {
            return -1; 
        }
        else if(head==rear)
        {
            int z=head.val; 
            head=rear=null; 
            return z; 
        }else 
        {
            int z=head.val;
            head=head.next; 
            return z; 
        }
    }
    public int get()
    {
        return head!=null?head.val: -1; ; 
    }
    public void insert(int val)
    {
        if(head==null)
        {
            head=new node();
            head.val=val;
            head.next=null; 
            rear=head; 
            
        }else 
        {
            node n=new node(); 
            n.val=val; 
            n.next=null; 
            rear.next=n; 
        }
    }
  public   QueueList()
    {
        head=null; 
        rear=null; 


    }
}
