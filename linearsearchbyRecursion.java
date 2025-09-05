public class linearsearchbyRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,3,9};
        linear(arr, 0,9);
    }
    public static void linear(int[] arr,int n,int key){
        if(arr[n]==key){
            System.out.println(n);
            return;
        }
        else{
            linear(arr, n+1,key);
        }
    }
}
