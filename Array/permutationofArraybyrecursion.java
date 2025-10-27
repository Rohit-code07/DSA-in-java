public class permutationofArraybyrecursion {
    public static void main(String[] args) {
        String str="abc";
       permutation(str, "");
    }
    public static void permutation(String str,String newString){
      if(str.length()==0){
        System.out.println(newString);
        return;
      }
        for(int i=0;i<str.length();i++){
       char currchar=str.charAt(i);
        String permString=str.substring(0,i) + str.substring(i+1);
        permutation(permString,newString+currchar);
      }
    }
}
