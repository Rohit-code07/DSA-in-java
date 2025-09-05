public class palindromeString {
    public static void main(String[] args) {
        String a="add";
          boolean ans=ispalindromOrnot(a);
System.out.println(ans);
    }
    public static boolean ispalindromOrnot(String a){
       String b="";
       boolean ans=false;
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);          
        }
        
 if(a.equals(b)){
    ans=true;
 }
return ans;
    }
}
