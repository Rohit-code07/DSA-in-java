//incorrect code 
import java.util.Arrays;
public class Three_way_partitioning {
    public static void main(String[] args) {
        int[]arr= {9,2,3,4,7,1,8,5};
     
 boolean ans=partitioning(arr, 1, 4);
System.out.println(ans);
    }
    public static boolean partitioning(int []arr,int a,int b){
      int n=arr.length;
      boolean ans=false;
        int []brr= new int[n];
      int i=0,index=0;
      int j=0;
      int k=0;
        for( i=0;i<arr.length;i++){
        if(arr[i]<a){
           brr[index++]= arr[i];
        
    }}
          
           for(j=0;j<arr.length;j++){
            if(arr[j]>=a && arr[j]<=b){
           brr[index++]=arr[j];
          
           }}
           
         for(k=0;k<arr.length;k++){
            if(arr[k]>b){
                brr[index++]=arr[k];
             
           }
        }
       
       ans=Arrays.equals(arr,brr);
       return ans;
        }
      
        

    }
