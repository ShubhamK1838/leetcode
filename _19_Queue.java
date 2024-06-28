public class _19_Queue {



    
}

class MyQueue {

    queue q; 
    public MyQueue() {
        q=new queue(100); 

    }
    
    public void push(int x) {
        q.insert(x); 
    }
    
    public int pop() {
        
        return q.remove(); 
    }
    
    public int peek() {
        return q.get(); 
    }
    
    public boolean empty() {
        return q.isEmpty() ;
    }
}

class queue{

    int front, rear; 
    int list[];
    
    

    public void status()
    {
        for(int i=front; i<rear ;i++)
        {
            System.out.print(list[i]+" "); 
        }
    }
    public boolean isEmpty()
    {
       return front==rear?true: false;  

    }
    public int get()
    {
        return isEmpty()?-1 : list[front]; 
    }
    public int remove()
    {
        if(front!=rear)
        {
            return list[front++]; 
        }else 
        {
            front=rear=0; 
            return -1; 
        }
    }
    public void insert(int val)
    {
       if(rear!=list.length-1 )
       {
            list[rear++]=val; 
       }else 
       {
            list=copy(list); 
             list[rear++]=val; 
       }
    }
    public int[] copy(int ar[])
    {
        int a[]=new int[ar.length*2];

        for(int i=0; i<ar.length; i++)
            a[i]=ar[i]; 
            
        return a;   
    }
    public queue(int size)
    {
        list=new int[size]; 
        front=rear=0; 

    }
}