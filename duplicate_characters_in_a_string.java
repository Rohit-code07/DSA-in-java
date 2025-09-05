import java.util.ArrayList;

public class duplicate_characters_in_a_string {
    public static void main(String[] args) {
        String a ="geeksforgeeks";
        duplicates(a);
    }
    public static void duplicates(String a){
     ArrayList<Character> list = new ArrayList<>() ;
     char ch=0;
     int count=0;
        for(int i=0;i<a.length();i++){
             ch=a.charAt(i);          
            count=0;
            for(int j=0;j<a.length();j++){
             if(ch==a.charAt(j)){
                count++;
             }
            }
       if(count>1&&!list.contains(ch)){
            list.add(ch);
        }
        }
      System.out.println(list);
    }
}
