import java.util.*;

public class maxValueof2Darray {
    public static void main(String[] args) {
      int[][] arr={{23,4,56,65,32},{34,45,656,76,121},{24,41,53,57,778}};
      int max=Integer.MIN_VALUE;
      System.out.println("Maximum vlaue of array:"+maxvalue(arr,max));
    }
    public static int maxvalue(int[][] arr,int max){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
       }
       return max;
        
    }
}
