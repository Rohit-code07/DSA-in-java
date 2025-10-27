public class reverseStringUSIngrecursion {
    public static void main(String[] args) {
        String str="rohitverma";
        int n=str.length()-1;
        reverse(str, n, "");
    }
    public static void reverse(String str,int n,String newstring){
        if(n<0){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(n);
        newstring+=currchar;
        reverse(str, n-1, newstring);

    }
}
