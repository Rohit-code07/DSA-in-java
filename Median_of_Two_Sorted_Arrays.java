import java.util.Arrays;
public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6};
        int[]brr= {7,8,9,10,11};
 float median =medianofarrays(arr, brr);
 System.out.println(median);
    }
    public static float medianofarrays(int[]arr,int []brr){
        // firstly we merge the array
        float median=0;
        int n=arr.length;
        int m=brr.length;
        int size=n+m;
        int[] crr=new int[size];
        for(int i=0;i<n;i++){
          crr[i]=arr[i];
         
        }
        for(int j=0;j<m;j++){
       crr[j+n]=brr[j];
        }
        Arrays.sort(crr);
        int q=crr.length;
        if(q%2==1){
            median=crr[q/2];
        }
        else{
            median=(crr[q/2-1]+crr[q/2])/2.0f;
        }
        return median;
    }

    
}
