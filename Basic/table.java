
import java.util.*;
public class table {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num =sc.nextInt();
    int temp=0;
    for(int i=1;i<=num;i++){
        System.out.println("  ");
        for(int j=1;j<=10;j++){
         temp=i*j;
         System.out.println("\t");
        
         System.out.println(temp);
        }
    }
  
    }
    
}
