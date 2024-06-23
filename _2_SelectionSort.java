import java.util.Arrays;

public class _2_SelectionSort {

    public static void main(String ar[])
    {
        
        int arr[]=new int[]{9,7,2,3,1,4,6,5,8};

        selection(arr);
    }

    public static void selection(int ar[])
    {


        int j; 
        int i; 

        for(i=0; i<ar.length; i++)
        {
            System.out.print(Arrays.toString(ar)+"\t--> "); 
            j=findMin(ar, i); 
            swap(ar, i, j);
            System.out.println(Arrays.toString(ar)); 
        }

        

        
    }
    public static void swap(int ar[], int i, int j)
    {
        int tmp=ar[i]; 
        ar[i]=ar[j]; 
        ar[j]=tmp; 
    }
    public static  int findMin(int ar[], int start)
    {
        int min=start; 

        for(int i=start; i<ar.length; i++)
        {
            if(ar[i]<ar[min])
            {
                min=i; 
            }
        }

        return min; 
    }
    
}
