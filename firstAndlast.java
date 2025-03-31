import java.util.*;

public class firstAndlast {
    public static void main(String[] args) { 

    }
        public static int searchRange(int [] arr,int target){
        
    int[] ans={-1,-1};
       
    
    boolean findstartindex;
int start= search(arr, target, true);
int end=search(arr, target, false);
 ans[0]=start;
 ans[1]=end;
 return ans;
    }
 public static int search(int[] arr,int target,boolean findstartindex){
    int start=0;
    int end=arr.length-1;
    int ans=-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==target){
            ans=mid;
         if(findstartindex){
            end=mid-1;
         }
         else{
            start=mid+1;
         }
        }
        else if(arr[mid]<target){
        start=mid+1;
        }
        else{
           end=mid-1;}
    }
    return ans;
}
 }








