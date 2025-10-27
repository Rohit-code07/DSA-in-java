
import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static  long plusOne(int[] arr){
      for(int i=0;i<arr.length;i++){

        if(arr[i]<9){
            arr[i]++;
            return arr[i];
        }
       arr[i]=0;
        
      }
      return arr[arr.length]+1;

    
    }
}
