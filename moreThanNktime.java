import java.util.*;
import java.util.Arrays;
public class moreThannktime {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,3,4,2,3,4,2};
Scanner sc =  new Scanner(System.in);
System.out.println("Enter the value of k: ");
int k=sc.nextInt();
checkNktime(arr, k);
//wrong code
    }
    public static void checkNktime(int[]arr,int k){
        int n=arr.length;
        int num=n/k;
        int same=0;
        int fav=0;
        int[] brr=new int[10];
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]==arr[j]){
                fav=arr[i];
                }
            }
            for(int p=0;p<n;p++){
                if(arr[p]==fav){
                    same++;
                }
            }
            if(same<=num){
                brr[i]=fav;
            }
        }
        System.out.println(Arrays.toString(brr));

    }
}
