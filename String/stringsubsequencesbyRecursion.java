public class stringsubsequencesbyRecursion {
    public static void main(String[] args) {
        String str="abc";
subsequences(str, 0, "");
    }
    public static void subsequences(String str,int n,String newString){
     
        if(n==str.length()){
            System.out.println(newString);
            return;
        }
      
         char currrchar=str.charAt(n);
         subsequences(str, n+1, newString+currrchar);
        subsequences(str, n+1, newString);

    }
}
