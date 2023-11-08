package Soft_Computing;
import java.util.HashMap;
import java.util.Map;

public class FuzzySetComplement {
    public static void main(String[] args) {
        Map<String, Double> A = new HashMap<>();
        Map<String, Double> Y = new HashMap<>();

        A.put("a", 0.2);
        A.put("b", 0.3);
        A.put("c", 0.6);
        A.put("d", 0.6);

        System.out.println("The Fuzzy Set is : " + A);

        for (String A_key : A.keySet()) {
            Y.put(A_key, 1 - A.get(A_key));
        }

        System.out.println("Fuzzy Set Complement is : " + Y);
    }
}
