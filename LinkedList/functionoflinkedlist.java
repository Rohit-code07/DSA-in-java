public class functionoflinkedlist {
    public static class Node{
        Node next;
        int val;
       
         Node(int val){
          this.val=val;
         }
    }
    public static class linkedlist {
         Node head=null;
        Node tail=null;
 //add        
    void add(int val){
        Node temp= new Node(val);
        if(head==null){
         head=temp;
       
        }
        else{
            tail.next=temp;
        }
        tail=temp;
     }
//insertAthead     
     void insertAthead(int val){
        Node temp=new Node(val);
       
       if(head==null){
         head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
     }
//insert at any position
     void insert(int idx,int val){
        Node element=new Node(val);
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        element.next=temp.next;
        temp.next=element;
        
     }   
// get element method
      int getelement(int idx){
          Node temp = head;
          for(int i=0;i<idx-1;i++){
          temp=temp.next;
         }
         return temp.val;
     } 
// delete a element at given idx   
     void deleteAt(int idx){
        Node temp=head;
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
     }  
//display
     void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
     }
        
    }

public static void main(String[] args) {
    linkedlist ll=new linkedlist();
    ll.add(7);
    ll.add(8);
    ll.add(2);
    ll.add(5);
   // ll.insertAtend(444);
    ll.insertAthead(77);
    ll.insert(2, 10);
    ll.deleteAt(3);
   // System.out.println(ll.tail.val);
  // System.out.println(ll.head.val);
    ll.display();
   // System.out.println();
   // System.out.println(ll.getelement(3));
}
}
