
import java.util.*;

public class mininumElementoArray {
    public static void main(String[] args) {
        int[] arr={34,45,535,141,556,76,878,90};
       System.out.print(min(arr));
        
    }
    static int min( int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
        
            /* for maximum value
              if(arr[i]>ans)   condition for maximum value  */
             
        // for minimum value 
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
