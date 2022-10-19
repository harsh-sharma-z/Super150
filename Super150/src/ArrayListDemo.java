import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(list);

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//        System.out.println(list);
//        list.add(1, -9);      //index range 0 to size
//        System.out.println(list);
//
//        // Get
//        System.out.println(list.get(2));
//        System.out.println(list.remove(1));
//        System.out.println(list);
//
//        // Update
//        list.set(2,40);
//        System.out.println(list);
//
//        // Sort
//        Collections.sort(list);
//        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Enhanced For-loop    -->only forward moving
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}