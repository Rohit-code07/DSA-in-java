import java.util.Arrays;
public class rearrangeTheElementBySign {
    
    public static void main(String[] args) {
        int[] arr={1,2,-3,-4,5,6,-7};
            rearrangeArray(arr);
    }
    public static void rearrangeArray(int[]arr){
        int neg=0,pos=0;
        int[]drr=new int[arr.length];
        for(int k=0;k<arr.length;k++){
            if(arr[k]<0){neg++;}
            else{pos++;}
        }
        int[]brr=new int[neg];
        int[]crr=new int[pos];
        int sum=neg+pos;
        System.out.println(neg);
        int bindex=0,cindex=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                brr[bindex++]=arr[i];
            }
           else if(arr[i]>0){
                crr[cindex++]=arr[i];
            }
        }
        Arrays.sort(brr);
        Arrays.sort(crr);
int brindex=0,crindex=0;
for(int j=0;j<arr.length;j++){
if(j%2==0){
    drr[j]=crr[crindex++];
}
else if(j%2!=0){
    drr[j]=brr[brindex++];
}
}
System.out.println(Arrays.toString(drr));

    }
}
