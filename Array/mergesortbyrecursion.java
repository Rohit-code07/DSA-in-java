import java.util.*;
import java.util.Arrays;
public class mergesortbyrecursion {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
    int[]brr=mergesort(arr);
    System.out.println(Arrays.toString(brr));
    }
    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int [] leftsidepart=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] rightsidepart=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
       return merge(leftsidepart, rightsidepart);
  

  }
    public static int[] merge(int[] leftsidepart,int[]rightsidepart){
        int[] mix= new int[leftsidepart.length+rightsidepart.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<leftsidepart.length&&j<rightsidepart.length){
            if(leftsidepart[i]<rightsidepart[j]){
                mix[k]=leftsidepart[i];
                i++;
           
            }
            else{
                mix[k]=rightsidepart[j];
                j++;
               
            }
            k++;
        }
        while(i<leftsidepart.length){
            mix[k]=leftsidepart[i];
           i++;
           k++;
        }
        while (j<rightsidepart.length) {
            mix[k]=rightsidepart[j];
            j++;
            k++;
          
        }
      return mix;
    }
}
