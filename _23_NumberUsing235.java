
import java.util.*; 

public class _23_NumberUsing235 {


    public static void main(String a[])
    {
        //  return the n-th number that contains 2 3 5 
        // 1- 2, 2-3, 3-5, 4-22,5-23,6-25

        Queue<Integer> list=new LinkedList<>(); 
        
        list.add(2);
        list.add(3); 
        list.add(4);

        
        int t=4; 
        int ele=0; 
        for(int i=0; i<t; i++)
        {
            ele=list.remove(); 

            list.add(ele*10+2); 
            list.add(ele*10+3); 
            list.add(ele*10+5); 
        }
        StringBuffer sb=new StringBuffer("hello"); 

        

        System.out.println(ele); 
    }
    
}
