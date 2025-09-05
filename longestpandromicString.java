import java.util.ArrayList;

public class longestpandromicString {
    public static void main(String[] args) {
        String s="forgeeksskeegfor";
        longestPalindrome(s);
    }
   public  static void longestPalindrome(String s) {
        // code here
        int n=s.length()-1;
    StringBuilder a= new StringBuilder();
    for(int i=n;i>=0;i--){
        a.append(s.charAt(i));
    }
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<=n;i++){
    if(s.charAt(i)==a.charAt(i)){
        list.add(i);
    }}
    System.out.println(list);
  //  for(int i=0;i<list.size();i++){
    //    if(list.get(i)==i+1){

      //  }
    
    int start=list.get(0);
    int end=list.get(list.size()-1);
    System.out.println(start);
    System.out.println(end);
        System.out.println(s.substring(start,end));
    }
}
