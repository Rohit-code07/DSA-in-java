public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[]arr ={"flower","flow","flight"};
findlogPrefix(arr);
    }
    // wrong code
    public static void findlogPrefix(String[] arr){
        System.out.println(arr.length);
        System.out.println(arr[0].length());
        String prefix="";
       for(int j=0;j<arr.length;j++){
for(int i=0;i<arr[j].length();i++){
if(arr[j].charAt(i)==arr[j+1].charAt(i)){
  System.out.print( arr[j].charAt(i));
   
}
}
}
System.out.println(prefix);
}
}