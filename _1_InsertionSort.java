public class _1_InsertionSort{


    public static void mian(String ar[])
    {

    }
    public static int[] insertionSort(int ar[])
    {
        int ele=0; 
        int j=0 ; 
        for(int i=1; i<ar.length; i++)
        {
            ele=ar[i]; 
            j=i-1; 
            while(j>=0 && ele<ar[j] )
            {
                ar[j+1]=ar[j]; 
                j--; 
            }
         
            ar[j+1]=ele; 
        }   

        return ar;
    }

   
}