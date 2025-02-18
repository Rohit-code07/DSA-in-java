/* 
import java.util.*;

public class maxMinofarray {
    //Find the maximum & minimum number in an array of integers. 

    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[] = new int [size];
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      int max=Integer.MAX_VALUE;
      int min=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];     
      }
    else if (arr[i]<min){
        min=arr[i];        
    }}
    System.out.println(max);
    System.out.println(min);
    }
} */
import java.util.*;


public class max {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}

