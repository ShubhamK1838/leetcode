


import java.util.Arrays; 
 
public class _5_AbsoluteDiffe
{


    public static void main(String[] args) {
        

        int ar[]=new int[]{1,3,6,10,15}; 

        Arrays.sort(ar); 

        int a=0, b=1; 
        int min, cur; 

        min=abs(ar[a], ar[b]); 

        
        while(b<ar.length)
        {
            cur=abs(ar[a], ar[b]); 

            if(min>cur)
            {
                min=cur; 
            }
            a++; b++;
        }

        System.out.println(" The absolute Value :"+ min); 

    }

    public static  int  abs(int a , int b)
    {
        return Math.abs(a-b); 
    }
}