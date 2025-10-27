import java.util.Arrays;
import java.util.*;
public class binarysearchof2Darray {
    public static void main(String[] args) {
        int[][] arr= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50},
        };
Scanner sc = new Scanner (System.in);
System.out.print("Enter the target: ");
int target = sc.nextInt();
System.out.println(Arrays.toString(search(arr,target)));
        
        
    }
    public static int[] search(int[][] arr, int target ){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length-1 && c>=0){
             if(arr[r][c]==target){
                return new int [] {r,c};
             }
             else if (arr[r][c]<target){
                r++;
             }
             else { 
                c--;
            }
        }
        return new int [] {-1,-1};
    }
}