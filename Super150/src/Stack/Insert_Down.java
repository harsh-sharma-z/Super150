package Stack;
import java.util.*;
public class Insert_Down {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Integer> s=new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        Insert(s,-3);
        System.out.println("After adding:"+s);
        rev(s);
        System.out.println("After reverse:"+s);
    }

    public static void rev(Stack<Integer>s)
    {
        if(s.isEmpty())
            return;

        int x=s.pop();
        rev(s);
        Insert(s,x);
    }

    public static void Insert(Stack<Integer>s ,int item) {
        if(s.isEmpty())
        {
            s.push(item);
            return;
        }
        int i=s.pop();
        Insert(s,item);
        s.push(i);
    }
}
