
import java.util.*;

public class ascendingsort {
    //Take an array of numbers as input and check if it is an array sorted in ascending order.
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the size of array: ");
   int size=sc.nextInt();
   System.out.print("Enter the elements of array: ");
int array[]= new int [size];
   for(int i=0;i<size;i++){
     array[i]=sc.nextInt();
   }
   boolean isAscending =true;
   for(int i=0;i<array.length-1;i++){
   if (array[i]>array[i+1]){
 isAscending =false;
}}
   if(isAscending){
    System.out.println("It is sorted in ascending order.");
   }
   else{
    System.out.println("It is not sorted in ascending order.");
   }
   
   }
}


