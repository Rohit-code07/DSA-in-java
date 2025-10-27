import java.util.Arrays;
public class Two_sum_Pairs_with_0_Sum { 
    public static void main(String[] args) {
        int[]arr={1,-2,3,4,7,2,-4};
        checkingpairs(arr);
    }
    public static void checkingpairs(int[]arr){
       int[] brr=new int[2];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          

            
if(arr[i]+arr[j]==0){
brr[0]=arr[i];
brr[1]=arr[j];
}
}}

System.out.println(Arrays.toString(brr));
}
}
