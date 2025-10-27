public class evennumberofdigits {
    public static void main(String[] args) {
        int count=0;
        int ans=0;
        int[] arr ={23,343,6542,24,5456642,66342};
        for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int num=arr[i];
            while(num>0){
            num=num/10;
            count++;

        }}
       
    
    if(count%2==0){
   
    ans++;
    }}
    System.out.println(ans);
}
}
