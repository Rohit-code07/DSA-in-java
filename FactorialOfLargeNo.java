import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
public class FactorialOfLargeNo {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int []arr=factorial(n);
System.out.println(Arrays.toString(arr));
    }
    public static int[] factorial(int n){

         int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
           
        } 
        //convert integer to string 
        String resultStr=Integer.toString(result);
        int[] digits= new int[resultStr.length()];
        for(int i=0;i<resultStr.length();i++){
            digits[i]=resultStr.charAt(i)-'0';
        }
        return digits;

    }
}
