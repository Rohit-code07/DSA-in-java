import java.util.*;
public class searchIn2Dmatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number:");
       int target=sc.nextInt();
       boolean ans=IsNumberfind(arr,target);
       System.out.println(ans);
    }
  
    public static boolean IsNumberfind(int[][] arr,int target ){
        boolean ans=false;
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if(arr[i][j]==target){
                ans=true;
               }
            }
        }
        return ans;
    }
}
