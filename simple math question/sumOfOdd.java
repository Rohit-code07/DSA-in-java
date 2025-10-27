
import java.util.*;

public class sumOfOdd {
    public static int oddNo(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                 sum =sum+i;
            }
         
        }   return sum;

    }
    public static void main(String[] args) {
        //Write a function to print the sum of all odd numbers from 1 to n.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int oddsum=oddNo(num);
        System.out.println("sum of odd number: "+oddsum);

        
    }
    
}
