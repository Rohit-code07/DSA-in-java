
import java.util.Arrays;
public class sort2Dmatrix {
    public static void main(String[] args) {
        int[][]arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};  
        int[][] brr=arraysort(arr);
    System.out.println(Arrays.toString(brr));
    }
    public static int[][] arraysort(int[][]arr){
        int size=arr.length*arr[0].length;
        int[] brr=new int[size];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                    brr[index++]=arr[i][j];
            }
        }
        Arrays.sort(brr);
        index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=brr[index++];
            }
        }
       return arr;
    }
}
