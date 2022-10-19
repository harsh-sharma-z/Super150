import java.util.Scanner;

public class palinstr {
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(validPalindrome(s));

    }
}
