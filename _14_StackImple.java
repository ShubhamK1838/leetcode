public class _14_StackImple {
    
    public static void main(String ar[])
    {

    }


    class Stack {
        int size; 
        int p; 
        int list[]; 
        public Stack(int size )
        {
          
            p=-1; 
            list=new int[this.size= size]; 

        }
        public int getSize()
        {
            return p+1; 
        }
        public int pop()
        {
            if(isEmpty())
            {
                return -1; 
            }else 
            {
                return list[p--]; 
            }
        }

        public boolean push(int val)
        {
            if(isFull())
            {
                return false; 
            }else 
            {
                list[++p]=val; 
                return true; 
            }
        }
        public boolean  isFull()
        {
            if(p==this.size-1 )
            {
                return true; 
            }else 
            {
                return false; 
            }
        }
            
        public boolean   isEmpty()
        {
            if(p==-1)
                return true; 
            else 
                return false; 
        }

        public void status()
        {
            for(int i=p; i>=0; i--)
            {
                System.out.print(list[i]+" "); 
            }
            System.out.println(); 
        }
        public int  peek()
        {
            return list[p]; 
        }
        
    }
    
}

// https://leetcode.com/problems/design-a-stack-with-increment-operation/
class CustomStack {

    stack list; 
    public CustomStack(int maxSize) {
        list=new stack(maxSize);
    }
    
    public void push(int x) {
        list.push(x); 
    }
    
    public int pop() {
        return list.pop(); 
    }
    
    public void increment(int k, int val) {
        list.incr(k , val); 
    }
}

    class stack {
        int size; 
        int p; 
        int list[]; 
        public stack(int size )
        {
          
            p=-1; 
            list=new int[this.size= size]; 

        }
        public int getSize()
        {
            return p+1; 
        }
        public int pop()
        {
            if(isEmpty())
            {
                return -1; 
            }else 
            {
                return list[p--]; 
            }
        }

        public boolean push(int val)
        {
            if(isFull())
            {
                return false; 
            }else 
            {
                list[++p]=val; 
                return true; 
            }
        }
        public boolean  isFull()
        {
            if(p==this.size-1 )
            {
                return true; 
            }else 
            {
                return false; 
            }
        }
            
        public boolean   isEmpty()
        {
            if(p==-1)
                return true; 
            else 
                return false; 
        }

        public void status()
        {
            for(int i=p; i>=0; i--)
            {
                System.out.print(list[i]+" "); 
            }
            System.out.println(); 
        }
        public int  peek()
        {
            return list[p]; 
        }
        public void incr(int k , int val)
        {
            for(int i=0; i<k && i<=p; i++)
            {
                list[i]+=val; 
            }
        }
        
    }
    

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */