import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        
        int[] arr={-2,3,-5};
    Bubblesort(arr);
    System.out.println(Arrays.toString(arr));
    }
    public static void Bubblesort(int[] arr){
      
        int i=0;
        int j=0;
        for( i=0;i<arr.length;i++){
            for( j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }}
      
    }
}
