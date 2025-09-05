public class StrictlyincreaingArraybyRcursion {
   /*  public static void main(String[] args) {
         int arr[]={1,2,2,3,4,5};
strict(arr, 0);
    }
    public static void strict(int[] arr,int n){
        if(n==arr.length-1){
            System.out.println("true");
            return;
        }
     if(arr[n]<arr[n+1]){

        strict(arr,n+1);
        
     }
     
    
     else{
        System.out.println("false");
        return;
     }
    }*/
    public static void main(String[] args) {
        String str="axbcdexxjix";
        movingcharacter(str, 0);
        printx(str, 0);
    }
    public static void movingcharacter(String str,int n){
       
        if(n==str.length()){
            return;
        }
        if(str.charAt(n)!='x'){
         System.out.print(str.charAt(n));
         movingcharacter(str,n+1);
        }
        else{
             movingcharacter(str,n+1);
        }
        
        }
        public static void printx(String str,int n){
            if(n==str.length()){
                return;
            }
            if(str.charAt(n)=='x'){
                System.out.print('x');
                printx(str,n+1);
            }
            else{
 printx(str,n+1);
            }
        }


    }


