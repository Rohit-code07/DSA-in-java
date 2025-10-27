import java.util.Arrays;
public class kThelementin2Darray {
   public static void main(String[] args) {
    int[][]arr={{16, 28, 60, 64}, {22, 41, 63, 91}, {27, 50, 87, 93}, {36, 78, 87, 94}};
    int ans=kTHterm(arr, 3);
System.out.println(ans); 
  } 
  public static int kTHterm(int[][]arr,int k){
     int size=arr.length*arr[0].length;
    int[] brr=new int[size];
    int index=0;
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            brr[index++]=arr[i][j];
        }
     }
Arrays.sort(brr);
return brr[k-1];
  }
}
