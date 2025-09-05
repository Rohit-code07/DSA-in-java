public class palindraomeusingrecursion {

    public static void main(String[] args) {
        int num=123;
        int oldnum=num;
reverse(num, 0,oldnum);
    }
    public static void reverse(int num,int num1,int oldnum){
       
     if(num==0){
         if(oldnum==num1){
            System.out.println("num:"+oldnum+"num1:"+num1);
            System.out.println("palindrome number");
        }
        else{
               System.out.println("num:"+oldnum+"num1:"+num1);
            System.out.println("non palindrome number");
        }

       
        return;
     }
    
        int m=num%10;
     num1=num1*10+m;
     num=num/10;
reverse(num,num1,oldnum);

    }
}