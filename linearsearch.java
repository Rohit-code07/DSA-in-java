import java.util.*;


public class linearsearch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int[] arr={1,23,45,666,78,89,434,21,24,46,78};
        System.out.print("Enter the number for seacrh: ");
        int target=sc.nextInt();
        int  ans=linearsearching(arr,target);
        System.out.println("Index value of searching number: "+ans);

        
    }
 static int  linearsearching(int[] arr,int target){
if(arr.length==0){
    return -1;
}
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        return i;
    }
} 
return -1;
}
}
