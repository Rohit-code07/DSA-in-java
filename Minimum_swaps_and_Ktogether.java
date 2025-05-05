import java.util.Arrays;

public class Minimum_swaps_and_Ktogether {
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,8,9,10,6,7};
System.out.println(minimumswaps(arr, 7));
}
public static int minimumswaps(int[]arr,int k){
    int fav=0;
   int nonfav=0;
    for(int i=0;i<arr.length;i++){
         if(k>=arr[i]){ 
            fav++;
        }
     }
     for(int i=0;i<fav;i++){
        if(k<arr[i]){
            nonfav++;
        }
     }
     int l=0,n=arr.length,r=fav-1;
int result =Integer.MAX_VALUE;
while(r<n){
    result=Math.min(result,nonfav);
    r++;
    if(r<n && arr[r]>k){nonfav++;}
    if(l<n && arr[l]>k){nonfav--;}
}
return (result==Integer.MAX_VALUE)?0:result;

}}