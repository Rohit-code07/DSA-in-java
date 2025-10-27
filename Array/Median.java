import java.util.Arrays;
public class Median{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
int ans=medianofsortedarray(arr);
System.out.println(ans);
    }
    public static int medianofsortedarray(int[][] arr){
          int size=arr.length*arr[0].length;
          int k=0;
          int[] brr=new int[size];
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              brr[k]=arr[i][j];
                k++;
                 }
             }
         Arrays.sort(brr);
     int medianIndex=(k-1)/2;
         return brr[medianIndex];
    }
    }

