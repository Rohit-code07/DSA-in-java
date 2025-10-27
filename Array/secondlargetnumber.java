import java.util.Arrays;

public class secondlargetnumber {
    
    public static void main(String[] args) {
       int[] arr={8,4,5,24,56,74,2,3,1};
        int n=arr.length-1;
        Arrays.sort(arr);
        int second=0;
       for(int i=1;i<n;i++){
           if(arr[n]==arr[n-i]){
              second=arr[n-i-1];
           }
           else{
            second=arr[n-1];
           }
       }
    System.out.println(second); 

    }
}
