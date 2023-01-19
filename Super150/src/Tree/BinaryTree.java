package Tree;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree(){
        root = createTree();
    }

    private Node createTree(){
        int item = sc.nextInt();
        Node node = new Node(item);
        boolean hasLeftChild = sc.nextBoolean();
        if(hasLeftChild){
            node.left = createTree();
        }
        boolean hasRightChild = sc.nextBoolean();
        if(hasRightChild){
            node.right = createTree();
        }
        return node;
    }

    private void display(Node node){
        if(node==null){
            return;
        }
        String s = "";
        s = "<--"+s+node.val+"-->";
        if(node.left!=null){
            s = node.left.val+s;
        }else{
            s = "."+s;
        }
        if(node.right!=null){
            s = s+node.right.val;
        }
        else{
            s = s+".";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);
    }

    public void display(){
        display(root);
    }
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val+" ");
    }

    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node  root)
    {
        if(root==null)
            return;
        System.out.println(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node root)
    {
        if(root==null)
            return ;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public boolean Search(int item)
    {
        return Search(root,item);
    }
    private boolean Search(Node node,int item){
        if(node==null){
            return false;
        }
        if(node.val==item){
            return true;
        }
        boolean left=Search(node.left,item);
        boolean right=Search(node.right,item);
        return left||right;
    }
    public int max(){
        return max(root);
    }
    private int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int left=max(node.left);
        int right=max(node.right);
        return Math.max(left,Math.max(right,node.val));
    }

    public int height()
    {
        return height(root);
    }

    private int height(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;

    }

}

