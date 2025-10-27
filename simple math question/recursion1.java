public class recursion1 {
    
    //factorial
    public static void main(String[] args) {
       factorial(5, 1);
       n=10;
        int a=0;
       int b=1;
        System.out.println(a);
    System.out.println(b);
       fibbonacci(0, 1, 8);
        String s="abcd";
       int n=s.length()-1;
       reverseString(s, n);
       String str="abadefewiaa";
      char key ='a';
       int n=str.length()-1;
        int firstOcc=-1;
    firstAndlast(str,0,key);
   }  
    
    public static void factorial(int n,int ans){
        if(n==0){
            System.out.println(ans);
            return;}
        ans=ans*n;

        factorial(n-1, ans);
    }


// fibbonacci

public static void fibbonacci(int a,int b,int n){
if(n==0){
    return;
}
int c=0;
   
    c=a+b;
    a=b;
    b=c;
System.out.println(c);
    fibbonacci(a, b, n-1);

}
//reverse String 

public static void reverseString(String s,int n){
 if(n<0)return;

System.out.print(s.charAt(n));
reverseString(s,n-1);
}
}
