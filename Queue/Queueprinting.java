import java.util.LinkedList;
import java.util.Queue;

public class Queueprinting {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
         Queue<Integer> w=new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
       
while(q.size()>0){
int top=q.remove();
     w.add(top);
    System.out.print(top+" ");
}
//System.out.println(q);
while(w.size()>0){
q.add(w.remove());
}
System.out.println(q);
    }
}
