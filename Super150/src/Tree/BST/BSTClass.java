package Tree.BST;

import Tree.CreateLevelOrder;

public class BSTClass {

    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public BSTClass(int[] in)
    {
        this.root=CreateTree(in,0,in.length-1);
    }
    public Node CreateTree(int[] in,int si,int ei)
    {
        if(si>ei)
            return null;
        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left= CreateTree(in,si,mid-1);
        nn.right=CreateTree(in,mid+1,ei);
        return nn;
    }
    public void preOrder()
    {
        this.preOrder(this.root);
    }
    private void preOrder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] in={10,20,30,40,50,60,70,80,90};
        BSTClass bst=new BSTClass(in);
        bst.preOrder();
    }
}


//        public boolean structurallyIdentical(BST other) {
//            return this.structurallyIdentical(this.root, other.root);
//        }
//        private boolean structurallyIdentical(Node tnode, Node onode) {
//            if(tnode==null && onode==null) return true;
//            if(tnode==null || onode==null) return false;
//            return structurallyIdentical(tnode.left, onode.left) && structurallyIdentical(tnode.right, onode.right);
//        }
