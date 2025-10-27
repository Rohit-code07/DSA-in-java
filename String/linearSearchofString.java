
import java.util.*;
public class linearSearchofString {
    public static void main(String[] args) {
        String name="ROHIT VERMA";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character of string to search: ");
        char target=sc.next().charAt(0);
    System.out.println(stringSearch(name,target));

    
    }
    public static boolean stringSearch(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
         
         if(name.charAt(i)==target){
           return true;

         } return false;
        }
        return false;
    }
}
