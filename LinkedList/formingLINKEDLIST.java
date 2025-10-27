public class formingLINKEDLIST {
    public static class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
        }
    }
    public static class linkedlist{
      Node head=null;
      Node tail=null;
      void add(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
      }  
      void insertAtend(int data){
        Node temp=new Node(data);
     add(data);
      }
      void insertAthead(int data){
        Node temp=new Node(data);
        if(head==null){
           head=temp;
        }
           temp.next=head;
           head=temp;
        
      }
      void insertAt(int idx,int data){
        Node temp=head;
        Node t=new Node(data);
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
      }
      void displays(){
         Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
      }  
        
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.add(8);
        ll.add(9);
        ll.insertAthead(3);
        ll.insertAt(3,1);
        ll.displays();
    }
}
