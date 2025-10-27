
import java.util.*;


public class infinityArrayinBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
     Scanner sc=new Scanner(System.in);  
     System.out.print("Enter the number to searh: ");  
    int target=sc.nextInt();
   
   int ans= range(arr, target);
System.out.println(ans);
 }
 public static int range(int [] arr,int target){
    int start=0;
    int end=1;
    while(target> arr[end]){
     int temp=end+1;
     //end=pervious end + sizeofbox*2;
     end=end+(end-start+1)*2;
start=temp;
    }
     return binary(arr, target, start, end);
 }
 public static int binary(int[] arr,int target,int start ,int end){
    
    while(start<=end){
        int mid= start +(end-start)/2;
        if(arr[mid]==target){
         return mid;
        }
        else if(arr[mid]<target){
        start=mid+1;
        }
        else{
           end=mid-1;}
    }
    return -1;
}}
 
