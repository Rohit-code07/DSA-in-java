import java.util.Scanner;
//Floor=Greatest number in array < = target.
public class floorBinarysearch {
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
        return end;
    }

}
