import java.lang.reflect.Array;
import java.util.Arrays;

public class _3_MergeSort {

    public static void main(String ar[])
    {

        int arr[]=new int[]{9,4,7,1,2,8,4,8};
            
        
        var st=Arrays.toString(sort(arr)); 

        System.out.println(st); 
    }

    public static  int[] sort(int ar[])
    {
        int len=ar.length, ar1[], ar2[]; 

        if(len==1)
        {
            return ar; 
        }

        ar1=Arrays.copyOfRange(ar, 0, len/2); 
        ar2=Arrays.copyOfRange(ar, len/2, len); 

        ar1=sort(ar1); 
        ar2=sort(ar2); 

        return merge(ar1,ar1.length, ar2, ar2.length); 

    }

    public  static int [] merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ar[]=new int[m+n]; 

        int i=0, j=0,c=0; 
        while(i<m && j<n){
            

            if(nums1[i]<nums2[j])
            {
                ar[c++]=nums1[i++]; 
            }else
            {
                ar[c++]=nums2[j++]; 
            }
            
        }
        while(i<m)
        {
            ar[c++]=nums1[i++]; 
        }
        while(j<n)
        {
            ar[c++]=nums2[j++]; 
        }
        
        return ar;
    }
    
}
