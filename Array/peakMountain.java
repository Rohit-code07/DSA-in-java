
import java.util.*;

public class peakMountain {
    public static void main(String[] args) {
        int[] arr={ 1,2,3,4,5,6,7,8,9,7,6,5,4,3,2,1};
        
       System.out.println("Index:"+check(arr));
        
    }
    public static int check(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
        int mid=(start+end)/2;
        if (arr[mid]>arr[mid+1]){
            //It is descending order sorted
            end=mid;
        } 
        else {
            // It is ascending order sorted 
            start = mid +1;

        }}
        return start;
    }
}
