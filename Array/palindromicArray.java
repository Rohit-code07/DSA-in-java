public class palindromicArray {
    public static void main(String[] args) {
        int[] arr={111,333,777,2342};
         boolean yes=checkpalindromOrNot(arr);
System.out.println(yes);
    }
    public static boolean  checkpalindromOrNot(int arr[]){
        boolean  isRight=false;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int original_num = arr[i];
            int reversed_num=0;
            int n =arr[i];
            while(n>0){
            int digit =n%10;
            reversed_num=reversed_num*10+digit;
             n=n/10;
        }
            if(original_num==reversed_num){
            //It is palindrom number
            count++;
        }
    
        }
        if (count == arr.length){
           isRight= true;
        }
        return isRight;
    }
}

