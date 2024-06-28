import java.util.*; 


public class _18_StockSpan {
    
    
    public static void main(String arg)
    {

        
        int ar[]=new int[]{100, 80, 60, 70, 60, 75, 85}; 

        Stack<Integer> stack=new Stack(); 

        int ans=1; 
        int rtn[]=new int[ar.length]; 

        for(int i=0; i<ar.length; i++)
        {
            if(stack.isEmpty())
            {
                rtn[i]=1; 
            }else
            {
            
                while(!stack.isEmpty() && ar[i]>=ar[stack.peek()])
                {
                   ans=stack.pop();
             
                }

                if(stack.isEmpty())
                {
                    rtn[i]=i+1; 
                }else 
                 rtn[i]=i-stack.peek();
            
            }
            stack.push(i); 
        }


        var a=Arrays.toString(rtn); 
        
        System.out.println(a) ; 

        

    }
}


