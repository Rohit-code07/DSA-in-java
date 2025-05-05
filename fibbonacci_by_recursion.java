public class fibbonacci_by_recursion {
    public static void main(String[] args) {
     int ans=fibbo(7);
        System.out.println(ans);
    }
    public static int fibbo(int n){
       if(n<2)return n;
        return fibbo(n-1)+fibbo(n-2);
    }
}
