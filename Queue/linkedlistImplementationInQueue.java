public class linkedlistImplementationInQueue {
    public static class Node {
     int val;
    Node next;
    Node(int data ){
        this.val=data;   
    }
    }
    public static class queue{
    Node head=null;
    int size=0;
    public void add(int x){
    
      Node temp=head;
        Node a=new Node(x);
        if(head==null){
         head=a;
         size++;
         return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }temp.next=a;
       size++;
    }
    public void peek(){
        if(head==null)System.out.println("Queue is Empty");;
     System.out.println(head.val);
    }
    public void pop(){
        int x=head.val;
        head=head.next;
        size--;
        System.out.println(x);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
         System.out.println(size);
    }
    void isEmpty(){
        if(size==0)System.out.println("true");
        else System.out.println("false");
    }
    }
    public static void main(String[] args) {
        queue Q=new queue();
    //     Q.add(1);
    //     Q.add(2);
    //     Q.add(3);
    //     Q.add(4);
    //     Q.add(5);
    //     Q.add(6);
    //     Q.add(7);
    //     Q.add(8);
    //     Q.display();
    //     Q.pop();
    //   //System.out.println(Q.peek());
    //    Q.display();
    //    Q.size();
    //    Q.peek();
       Q.isEmpty();
    }
}
