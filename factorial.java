

import java.util.*;

public class factorial {
    public static void fact(int a) {
        int f=1;
        if(a==0){
            System.out.println(0);
        }
        else{
        for(int i=a;i>=1;i--){
            
            f=f*i;
            
        }
        System.out.println(f);
          
        }
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int x = sc.nextInt();
     fact(x);
 
}    
}
