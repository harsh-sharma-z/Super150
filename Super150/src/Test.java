//Given a linked list of length N and an integer K , append the last K elements of a linked list to the front. Note that K can be greater than N.
//
//        Input Format
//        First line contains a single integer N denoting the size of the linked list.
//        Second line contains N space separated integers denoting the elements of the linked list.
//        Third line contains a single integer K denoting the number of elements that are to be appended.
//

import java.util.Scanner;

class Node{
    int val;
    Node next;
    public Node(int item){
        this.val = item;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    private Node tail;
    private int size;

    public void addAtEnd(int item) {
        Node node = new Node(item);
        if (this.size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtBegin(int item) {
        Node node = new Node(item);
        if (this.size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public int removeFirst() throws Exception {
        if (size < 1) {
            throw new Exception("LinkedList is empty");
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        }
        int n = head.val;
        head = head.next;
        size--;
        return n;
    }

    private Node getNode(int k) throws Exception {
        if (k < 0 || k > size) {
            throw new Exception("index out of range");
        }
        Node temp = head;
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int removeLast() throws Exception {
        if (size < 1) {
            throw new Exception("LinkedList is empty");
        }
        if (size == 1) {
            return removeFirst();
        } else {
            Node ss = getNode(size - 2);
            int n = tail.val;
            tail = ss;
            tail.next = null;
            size--;
            return n;
        }
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList uwu = new LinkedList();
        for (int i = 0; i < n; i++) {
            uwu.addAtEnd(sc.nextInt());
        }
        int k = sc.nextInt();

        appendK(uwu, k, n);
    }

    public static void appendK(LinkedList uwu, int k, int n) throws Exception{
        k = k%n;

        while (k-->0){
            int oni = uwu.removeLast();
            uwu.addAtBegin(oni);
        }

        Node gambare = uwu.head;
        while (gambare!=null){
            System.out.print(gambare.val+" ");
            gambare = gambare.next;
        }
    }
}
