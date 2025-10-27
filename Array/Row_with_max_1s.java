import java.util.Arrays;
public class Row_with_max_1s {
    public static void main(String[] args) {
         int  arr[][] = {{0,1,1,1},{0,0,0,0},{1,1,1,1},{0,0,0,1},{0,1,1,1},{0,0,0,1},{0,0,0,1}};
        max1sRow(arr);
    }
    public static void max1sRow(int[][]arr){
        int index=arr.length;
        int[] brr=new int[index];
        int k=0;
        
     for(int i=0;i<arr.length;i++){
        int one=0;
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==1){
              one++;
            }
           }
           brr[k++]=one;
     }
      int ans=0;
     int max=Integer.MIN_VALUE;
     System.out.println(Arrays.toString(brr));
     for(int i=0;i<brr.length;i++){
        if(brr[i]>max){
        max=brr[i]; 
         ans=i;
       }
     }
     System.out.println(ans);
    }
}
