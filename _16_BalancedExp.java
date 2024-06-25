// https://leetcode.com/problems/valid-parentheses/



public class _16_BalancedExp {

    
}
class Solution {
    public boolean isValid(String s) {
         
          stack st=new stack(s.length()); 
      
        String exp=s; 
        
        
       
        
        int p=0; 

        char c; 
        
        while(p<exp.length())
        {
            c=exp.charAt(p);

            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);

            }else if(c==']' || c=='}' || c==')')
            {
                char tmp=(char)st.pop(); 
                if((tmp=='(' && c==')' ) || (tmp=='[' && c==']' ) ||(tmp=='{' && c=='}' ))
                {
                    
                }else{
                   return false; 
                }
                
            }
            p++; 
        }
        
        if(st.getSize()!=0)
            return false; 
        else 
        return true;  
    
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
