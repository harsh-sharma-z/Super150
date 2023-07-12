package Trie;

import java.util.HashMap;

public class TrieContact {
    public class Node{
        // is node mein  character ke corres. mein child hai
        char ch;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isLast = false;
        int count=1;
    }

    private Node root;

    public TrieContact() {
        Node nn = new Node();
        nn.ch = '*';
        this.root = nn;
    }

    public void insert(String word) {
        Node curr=root;

        for(int i=0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch)) {
                curr.count++;
                curr = curr.child.get(ch);
            }
            else{
                Node nn = new Node();
                nn.ch=ch;
                curr.child.put(ch,nn);
                curr=nn;
            }
        }

        curr.isLast=true;
    }

    public int search(String word) {
        Node curr = root;

        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(!curr.child.containsKey(ch))
                return 0;
            curr = curr.child.get(ch);
        }

        return curr.count;
    }
}
