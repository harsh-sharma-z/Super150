package LinkedList;

import java.io.IOException;

public class LinkedList {
    private class Node{
        int val;
        Node next;
        public Node(int item){
            this.val = item;
            this.next = null;
        }


    }

    private static Node head;
    private Node tail;
    private static int size;

    public void addFirst(int item){
        Node node = new Node(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int item){
        Node node = new Node(item);
        if(this.size==0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }


    private Node getNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("index out of range");
        }
        Node temp = head;
        for(int i=1;i<=k;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addAtPos(int item, int pos) throws Exception{
        if(pos<0 || pos>=size){
            throw new Exception("index out of range");
        }
        if(pos==0){
            addFirst(item);
        }
        else if(pos==size){
            addLast(item);
        }
        else{

            Node K_1th =getNode(pos-1);

            Node nn=new Node(item);

            nn.next=K_1th.next;

            K_1th.next=nn;

            size++;

        }
    }


    public int getAtIndex(int k) throws Exception{
        return getNode(k).val;
    }

    public static int removeFirst()
    {
        int data=head.val;
        head=head.next;
        size--;
        return data;
    }

    public int removeLast() {
        if(size==1)
        {

            size--;
            return removeFirst();
        }

        Node temp=new Node(0);
        temp=head;
        while(temp.next.next!=null)
            temp=temp.next;
        int data=temp.next.val;
        temp.next=null;
        size--;
        return data;



    }

//    public static int removeAtIndex(int k) throws Exception{
//        if(k==0)
//        {
//            return removeFirst();
//        }
////        else if(size-1==k)
//            return removeLast();
//
//
//    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.display();
        ll.addLast(5);
        ll.addLast(6);
        ll.display();
        ll.addAtPos(10,3);
        ll.display();

    }
}