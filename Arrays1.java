
import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size: ");
    int size= sc.nextInt();
  System.out.println("Enter the name:");
       String name[]= new String[size];
       for(int i=0;i<size;i++){
        name[i]=sc.next();
    }
    System.out.println("There are the following names:");
    for(int i=0;i<name.length;i++){
        System.out.println(name[i]);
    }
    }
}
