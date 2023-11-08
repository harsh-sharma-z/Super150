package Soft_Computing;

import java.util.HashMap;
import java.util.Map;

public class FuzzySetUnion {
    public static void main(String[] args) {
        Map<String, Double> A = new HashMap<>();
        Map<String, Double> B = new HashMap<>();
        Map<String, Double> Y = new HashMap<>();

        A.put("a", 0.2);
        A.put("b", 0.3);
        A.put("c", 0.6);
        A.put("d", 0.6);

        B.put("a", 0.9);
        B.put("b", 0.9);
        B.put("c", 0.4);
        B.put("d", 0.5);

        System.out.println("The First Fuzzy Set is : " + A);
        System.out.println("The Second Fuzzy Set is : " + B);

        for (String A_key : A.keySet()) {
            String B_key = A_key;
            Double A_value = A.get(A_key);
            Double B_value = B.get(B_key);

            if (A_value > B_value) {
                Y.put(A_key, A_value);
            } else {
                Y.put(B_key, B_value);
            }
        }

        System.out.println("Fuzzy Set Union is : " + Y);
    }
}
