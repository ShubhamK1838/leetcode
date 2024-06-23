import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class _4_qucksort{

    public static void main(String[] args) {
        
        // int ar[] =new int[]{9,3,2,1,4,5,6,8,7,11,13,20,17};
            int ar[]=new int[12]; 

            for(int i=0; i<ar.length; i++)
                ar[i]=new Random().nextInt(30); 

        int[]ar2=Arrays.copyOfRange(ar,0, ar.length);  
        sort(ar, 0, ar.length-1);

        var st=       Arrays.toString(ar); 

        System.out.println(st); 
        Arrays.sort(ar2); 
        System.out.println(Arrays.toString(ar2)); 
    }

    public static  void sort(int ar[], int l, int r)
    {
        if(l>=r)
        {
            return ;
        }

        int id=partition(ar, l, r);

        sort(ar, l, id-1);
        sort(ar, id+1, r);
    }
    public static  int  partition(int ar[], int l, int r)
    {

        System.out.println("-----------------------------------------------------------------------------------");
        
        int rtn=0; 
        
        
        int id= r , ele=ar[r]; 
        System.out.println(ar[id]+"\t"+Arrays.toString(Arrays.copyOfRange(ar, l, r+1))+"\t"); 
        
        ArrayList<Integer> small=new ArrayList<>(); 
        ArrayList<Integer> large=new ArrayList<>(); 
        
        for(int i=l; i<r; i++ )
        {
            if(ar[i]<=ar[id])
            {
                small.add(ar[i]); 
            }   else{
                large.add(ar[i]); 
            }
        }
        System.out.println(small+" \t"+large);
        int cur=l; 
        for(int i=0; i<small.size();i++)
        {
            ar[cur++]=small.get(i); 
        }
        
        ar[cur]=ele;
        rtn=cur++;
        
        
        
        
        
        for(int i=0; i<large.size(); i++)
        {
            ar[cur++]=large.get(i); 
        }
        
        System.out.println(Arrays.toString(Arrays.copyOfRange(ar, l, r+1))); 
        
        
        
        System.out.println("-----------------------------------------------------------------------------------");
        return rtn; 
    }
    
}