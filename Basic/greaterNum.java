
import java.util.*;
public class greaterNum {
    public static void compare(int a,int b){
        if(a<b){
            System.out.println("b is greater than a.");
        }
 else {
    System.out.println("a is greater than b.");
 }
    }
   public static void main(String[] args) {
    //Write a function which takes in 2 numbers and returns the greater of those two.
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a Number to compare a & b: ");
   int a = sc.nextInt();
   int b= sc.nextInt();
     compare(a,b);
   } 
}
