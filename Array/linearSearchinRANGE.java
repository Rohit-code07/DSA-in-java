
    import java.util.*;

    public class linearSearchinRANGE {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int[] arr={1,23,45,666,78,89,434,21,24,46};
        
        System.out.println("Enter the starting range btw you search: ");
        int start=sc.nextInt();
        System.out.println("Enter the ending range btw you search: ");
        int end=sc.nextInt();
        System.out.print("Enter the number for seacrh: ");
        int target=sc.nextInt();
    //function calling 
        int  ans=linearsearching(arr,target,start,end);
    //print the output 
        System.out.println("Index value of searching number: "+ans);

        }
    //Linear search function 
 static int  linearsearching(int[] arr,int target,int start,int end){

if(arr.length==0){
    return -1;
}
for(int i=start;i<=end ;i++){
    if(arr[i]==target){
        return i;
    }
} 
return -1;
}
}


