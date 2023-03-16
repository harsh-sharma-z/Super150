package Tree;

import java.sql.SQLOutput;

public class BT_client {
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.display();
        System.out.println("Preorder:");
        obj.preorder();
        System.out.println("Postorder:");
        obj.postorder();
        System.out.println("Inorder:");
        obj.inorder();
        System.out.println("Search:"+obj.Search(20));
        System.out.println("Max value:"+obj.max());
        System.out.println("Height:"+obj.height());
    }
}
