import java.util.Scanner;
//Ceiling= Smallest Element in array >= target.
public class CeilingBinarysearch {
     public static void main(String[] args) {
        int[] arr={2,5,10,11,13,14,15,16,17,19};
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the key for search: ");
      int key=sc.nextInt();
      System.out.println(arr[binary(arr,key)]);

    }
    public static int binary(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        // But what when the target element is greater than the greatest element
        if(key>arr[arr.length-1]){
          return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
             return mid;
            }
            else if(arr[mid]<key){
            start=mid+1;
            }
            else{
               end=mid-1;}
        }
        return start;
    }
}
