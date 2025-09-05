public class subsquencesOFstring {
    public static void main(String[] args) {
        String str="abc";
        substrings(str, 0, "");
    }
    public static void substrings(String str,int idx,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
       char currchar=str.charAt(idx);
        substrings(str, idx+1, newstring+currchar);
        substrings(str, idx+1, newstring);

    }
}
