import java.util.Arrays;
public class Spirally_traversing_a_matrix{
    
public static void main(String[] args) {
    int[][]arr= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
spirallyMatrix(arr);
}
public static void spirallyMatrix(int[][] arr){
    int k=0;
    int n=arr.length;
    int m=arr[0].length;
    int[] brr=new int[n*m];
    int srow=0,ecol=m-1;
    int scol=0,erow=n-1;

while(srow<=erow&&scol<=ecol){
    for(int j=scol;j<=ecol;j++){
      brr[k++]=arr[srow][j];
    } srow++;
    
    for(int i=srow;i<=erow;i++){
        brr[k++]=arr[i][ecol];
    }
    ecol--;
    if(srow<=erow){
    for(int j=ecol;j>=scol;j--){
        brr[k++]=arr[erow][j];
    } erow--;
}
    if(scol<=ecol){
    for(int i=erow;i>=srow;i--){
        brr[k++]=arr[i][scol];
    }scol++;
}
  
}
System.out.println(Arrays.toString(brr));
}


}