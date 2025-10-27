public class LinkedlistImplementation {


    public static class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
      void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
      }
      int peek(){
        return head.val;
      }
      void pop(){
         head=head.next;
         size--;
      }
      void displayrec(Node temp){
        if(temp==null)return;
        displayrec(temp.next);
        System.out.print(temp.val+" ");

      }
      void display(){
       displayrec(head);
       System.out.println();
      }
     int size(){
        return size;
     }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(6);
        st.push(7);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
