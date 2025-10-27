import java.util.HashMap;
import java.util.Map;

public class Smallest_window_containing_allelementOF_anotherString{
    public static void main(String[] args) {
         String s1 = "timetopractice";
         String s2 = "toc";
         smallestWindow(s1, s2);
    }
     public static void smallestWindow(String s1, String s2) {
        // Your code here
        boolean ans=false;
        HashMap<String,String> map=new HashMap<>();
        map.put("str1",s1);
        map.put("str2",s2);
        String value1=map.get("str1");
      String value2=map.get("str2");
   if(value1.contains(value2)){
           ans=true;
   } System.out.println(ans);
    }
}

