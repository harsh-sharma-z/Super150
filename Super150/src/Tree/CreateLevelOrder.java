package Tree;

import java.lang.instrument.ClassFileTransformer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateLevelOrder {
    public class Node {
      int val;
      Node left;
      Node right;
  }

  private Node root;
    Scanner sc=new Scanner(System.in);

    public CreateLevelOrder() {
        this.root=CreateTree();
    }

    private Node CreateTree()
    {
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        int val=sc.nextInt();
        nn.val=val;
        root=nn;
        q.add(nn);
        while(!q.isEmpty())
        {
            Node rv=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();

            if(c1!=-1)
            {
                Node node=new Node();
                node.val=c1;
                rv.left=node;
                q.add(node);
            }
            if(c2!=-1)
            {
                Node node=new Node();
                node.val=c2;
                rv.right=node;
                q.add(node);
            }
        }
        return root;
    }


    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node root)
    {
        if(root==null)
            return;
        System.out.println(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        CreateLevelOrder obj=new CreateLevelOrder();
        obj.preorder();
    }
}
