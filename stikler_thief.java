public class stikler_thief {
    public static void main(String[] args) {
        int[] arr={6, 5, 5, 7, 4};
stiklerthief(arr);
    }
    public static void stiklerthief(int[]arr){
             int ans=0;
        int ans1=0;
        int ans2=0;
 for(int i=0;i<arr.length;i=i+2){
     ans1+=arr[i];
 }

 for(int j=1;j<arr.length;j=j+2){
     ans2+=arr[j];
 }
 if(ans1<ans2){ans=ans2;}
 
 else ans=ans1;
 
 for(int i=0;i<arr.length;i++){
     if(arr[i]>ans){
         ans=arr[i];}
     }
     System.out.println(ans); 
    }
}
