import java.util.Arrays;

public class SelectionSort {
     public static void main(String[] args) {
    int[] arr= {22,11,3,4,5,7,21,1};
   Selection(arr);
   System.out.println(Arrays.toString(arr));

   
    }
public static void Selection(int []arr){
  for(int i=0;i<arr.length-1;i++){
    int last=arr.length-i-1;
int maxindex=findMaxelement(arr, last);
swap(arr,maxindex,last);
  }
}
public static void swap(int[] arr,int first,int second){
   int temp=arr[first];
   arr[first]=arr[second];
   arr[second]=temp;
}
    public static int findMaxelement(int[] arr,int end){
    int max=0;
    
   for(int i=1;i<=end;i++){
    if(arr[max]<arr[i]){
      max=i;
       
    }
   }
   return  max;
   }

    
}
