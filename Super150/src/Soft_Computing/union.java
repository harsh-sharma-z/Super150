package Soft_Computing;

import java.util.*;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1 , 2 , 3 , 4 , 5};
        int[] b = {3 , 4 , 5 , 6 , 7};
        HashSet<Integer> aa = new HashSet<>();
        HashSet<Integer> bb = new HashSet<>();
        HashSet<Integer> uni = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        HashSet<Integer> setDiff = new HashSet<>();
        HashSet<Integer> a_ = new HashSet<>();
        HashSet<Integer> b_ = new HashSet<>();

        for(int i : a){
            aa.add(i);
            uni.add(i);
        }
        for(int i : b){
            bb.add(i);
            uni.add(i);
        }

        for(int i : a)
            if(bb.contains(i))
                intersection.add(i);

        for(int i : a)
                if(!bb.contains(i))
                    setDiff.add(i);

        for(Integer i : uni)
            if(!aa.contains(i))
                a_.add(i);

        for(Integer i : uni)
                if(!bb.contains(i))
                    b_.add(i);

        System.out.println("Set A : " + aa);
        System.out.println("Set B : " + bb);
        System.out.println("Union : " + uni);
        System.out.println("Intersection : " + intersection);
        System.out.println("Set difference (A - B) : " + setDiff);
        System.out.println("A' : " + a_);
        System.out.println("B' : " + b_);

    }
}
