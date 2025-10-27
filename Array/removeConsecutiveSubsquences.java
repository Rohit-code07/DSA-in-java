import java.util.Stack;

public class removeConsecutiveSubsquences {


    public static int[] remove(int[]arr){
    Stack<Integer> st=new Stack<>();
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(st.size()==0||st.peek()!=arr[i]) st.push(arr[i]);
       else if(arr[i]==st.peek()){
       if(i==n-1|| arr[i]!=arr[i+1]){
            st.pop();
       }
    }
}
    int m=st.size();
    int[] res=new int[m];
    for(int i=m-1;i>=0;i--){
        res[i]=st.pop();
    }
    return res;
    } 
    public static void main(String[] args) {
       
        int[] arr={1,2,2,3,4,4,4,5,6,7,7,7,10,10,10,9};
        int[] brr=remove(arr);
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
