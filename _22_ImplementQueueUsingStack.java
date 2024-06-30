import java.util.*; 

public class _22_ImplementQueueUsingStack {

    public static void main(String ar[])
    {

        queue q=new queue(); 
        q.insert(10); 
        q.insert(20); 
        q.insert(30); 
        q.insert(40);
        
        q.status(); 
        System.out.println(q.remove()); 
        q.status(); 
        System.out.println(q.remove()); 
        q.status(); 
        
        
    }

    static class   queue{

        java.util.Stack<Integer> s1, s2; 
        public queue()
        {
            s1=new java.util.Stack(); 
            s2=new java.util.Stack();
            
            
        }

        public void status()
        {
            System.out.println(s1+" "+s2); 
        }

        public void insert(int val)
        {
            s1.push(val); 
        }
        
        public int remove()
        {
            if(s1.isEmpty() && s2.isEmpty())
            {
                return -1;  
            }else if(s2.isEmpty())
            {
                transfer(); 
                return s2.pop(); 
            }else 
            {
                return s2.pop(); 
            }
        }
        public void transfer()
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop()); 
            }
        }
        public int peek()
        {
            if(s2.isEmpty() && s1.isEmpty())
            {
                return -1; 
            }else if(s2.isEmpty()){
                
                transfer(); 
                return s2.peek();
            }else 
            {
                return s2.peek(); 
            }
        }

    }
    
    

    
}
