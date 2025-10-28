//package Trees;

public class MaxElementOFtree {
    public static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
           this.val=val;
        }
    }
    public static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
         int a=root.val;
         int b=max(root.left);
         int c=max(root.right);
         return Math.max(a,Math.max(b, c));

    }
    public static void main(String[] args) {
        Node root=new Node(-1);
        Node a=new Node(-3);
        Node b=new Node(-2);
        root.left=b;
        root.right=a;
        Node c=new Node(-4);
        Node d=new Node(-5);
        b.left=c;
        b.right=d;
        Node e=new Node(-9);
        a.right=e;
        System.out.println(max(root));

    }
}
