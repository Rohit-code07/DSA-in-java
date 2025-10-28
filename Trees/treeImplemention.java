//package Trees;
// Pre-Order 
public class treeImplemention {
    public static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
           this.val=val;
        }
    }
    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+" -> ");
      if(root.left!=null)  System.out.print(root.left.val+",");
      else System.out.print("N"+",");
      if(root.right!=null)  System.out.print(root.right.val);
      else System.out.print("N");
      System.out.println();
      display(root.left);
      display(root.right);
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
        display(root);

    }
}
