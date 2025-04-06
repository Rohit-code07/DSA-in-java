import java.util.*;

public class orderAgnosticBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the searching target of array: ");
        int target=sc.nextInt();
        int max=0;
        int ans=0;
        int[] arr={9,8,7,6,5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
         if(arr[i]<max){
           max=arr[i];
         }
        }
        /* boolean isasc= arr[start]<arr[end];
         * In boolean it givew true when ascending
         * otherwise false.
         */
        if(arr[0]==max)//if(isasc==true)
        { //It is ascending order
            System.out.println("It is ascending sorted array:");
            ans=ascendingbinary(arr, target);
        }
        else{
            // It is descending order
            System.out.println("It is descending sorted array:");
        ans= descendingbinary(arr, target);

        }
        System.out.println(ans);
    }
    public static int descendingbinary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
             return mid;
            }
            else if(arr[mid]<target){
                end=mid-1;
            
            }
            else{start=mid+1;
               }
        }
        return -1;
    }

    
    public static int ascendingbinary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
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
    }
}
