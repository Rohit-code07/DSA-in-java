
import java.util.Arrays;

public class merge_and_SortingOfArrray {
    public static void main(String[] args) {
        int []arr={1,3,5,7};
        int[]brr={0,2,6,8,9};
        
        System.out.println(Arrays.toString(merge(arr,brr)));
    }
    public static int[] merge(int[]arr,int[]brr){
        int size= arr.length+brr.length;
        int[]crr= new int [size];
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];}
       
        for(int j=0;j<brr.length;j++){
            crr[arr.length+j]=brr[j];
        }
    Arrays.sort(crr);
     return crr;
    }
   
}
