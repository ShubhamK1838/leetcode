public class prtc
{


    public static void main(String[] args) {
        
    }

    public static void   print(int ar1[], int n1, int ar2[] , int n2)
    {
        
        if(ar1.length>=n1)
        {
            if(ar2.length>n2)
            {
                System.out.print(" " +ar2[n2]); 
            }
        }
        if(ar2.length>=n2)
        {
           
            if(ar1.length>n2)
            {
                System.out.print(" " +ar1[n1]); 
            }
        }

        if(ar1[n1]<ar2[n2])
        {
            System.out.print(" "+);
        }

    }
}