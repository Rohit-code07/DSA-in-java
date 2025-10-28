//package Trees;

public class sumOFtreeElement {
public static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
           this.val=val;
        }
    }
   public static int sum(Node root){
     if(root==null)return 0;
     return root.val+sum(root.left)+sum(root.right);
   }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(3);
        Node b=new Node(2);
        root.left=b;
        root.right=a;
        Node c=new Node(4);
        Node d=new Node(5);
        b.left=c;
        b.right=d;
        Node e=new Node(9);
        a.right=e;
System.out.println(sum(root));
    }
}
