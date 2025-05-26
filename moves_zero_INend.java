
import java.util.Arrays;
public class moves_zero_INend {
    public static void main(String[] args) {
        int[]arr={3 ,5 ,0 ,0 ,4};
      movesZERO(arr);
//System.out.println(Arrays.toString(brr));

    }
    public static  void movesZERO(int[] arr){
        /*int[]brr=new int[arr.length];
        int index=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                brr[index--]=arr[i];
        
            }
            
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]!= 0){
            brr[index--]=arr[j];
        }}*/
        int index=arr.length-1;
        int[]brr=new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                brr[index--]=0;
            }
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]!=0){
                brr[index--]=arr[j];
                
            }
      
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=brr[i];
       }
       System.out.println(Arrays.toString(arr));
          
}

   
}
