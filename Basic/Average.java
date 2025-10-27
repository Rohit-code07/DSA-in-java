import java.util.*;

public class Average {
    public static int average(int a,int b, int c){
        int avg =(a+b+c)/3;
        return avg;
         
    }
    public static void main(String[] args) {
 //Enter 3 numbers from the user & make a function to print their average.
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int avg=average(a,b,c);
      System.out.println("average of a,b,c:"+avg);

    }
    
}
