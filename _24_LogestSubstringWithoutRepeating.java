

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Solution{
    int longestUniqueSubsttr(String st){
        
         boolean ar[]=new boolean[130];
         
         int t=0; 
         int s=0; 
         
         int c=0; 
         int cur=0; 
         int max=0; 
         int tmp;
         
         while(s<st.length())
         {
             c=st.charAt(s); 
             
             if(ar[c])
             {
                 while(ar[c])
                 {
                    tmp=st.charAt(t); 
                    ar[tmp]=false; 
                    t++; 
                    cur--; 
                    
                 }
                 ar[c]=true; 
                 cur++; 
             }else
             {
                 ar[c]=true; 
                 cur++; 
             }
             
             max=Math.max(cur,max); 
             
             s++; 
         }
         return max; 
        
    }
}

public class _24_LogestSubstringWithoutRepeating {

    
    
}
