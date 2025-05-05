import java.util.Arrays;
public class unionOfArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int[]brr={2,3,8,9};
        findunionlength(arr, brr);
    }
    //wrong code
    public static void findunionlength(int[] arr,int[]brr){
        int N=arr.length+brr.length;
        int []crr=new int[N];
        int same=0;
     int n=arr.length;
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];

        }
        for(int j=0;j<brr.length;j++){
            crr[n+j]=brr[j];
        }
        for(int k=0;k<N;k++){
        for(int j=k+1;j<N;j++){
            if(crr[k]==crr[j]){
               same++;
            }
        }
        }System.out.println(N-same);
        int []drr=new int[N-same];
        for(int k=0;k<N;k++){
            for(int j=k+1;j<N;j++){
                if(crr[k]==crr[j]){
                   drr[k]=crr[j];
                }
                else{
                    drr[k]=crr[k];
                }
            }
            }
            System.out.println(Arrays.toString(drr));
    }
}
