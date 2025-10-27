public class print1to1000UsingRecursion {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n){
        if(n==1000){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
