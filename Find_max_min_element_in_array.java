public class Find_max_min_element_in_array {
    public static void main(String[] args) {
        int[] arr= {10,1,2,3,4,6,7};
         maximum(arr, 0, 0);
         minimum(arr, 0, Integer.MAX_VALUE);
    }
    public static void maximum(int[] arr,int n,int max){
       if(n==arr.length){
        System.out.println("largest element:"+max);
        return;
       }
        if(max<arr[n]){
            max=arr[n];
            maximum(arr, n+1, max);
        }
        else{
            maximum(arr, n+1, max);
        }

    }
    public static void minimum(int[]arr ,int n,int min){
        if(n==arr.length){
            System.out.println("smallest element:"+min);
            return;
        }
        if(min>arr[n]){
            min=arr[n];
            minimum(arr, n+1, min);
        }
        else{
            minimum(arr, n+1, min);
        }
    }
}
