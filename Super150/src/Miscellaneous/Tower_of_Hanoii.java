package Miscellaneous;
import java.util.*;
public class Tower_of_Hanoii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        towerOfHanoi(n , 'A' , 'C' , 'B');
    }

    private static void towerOfHanoi(int n , char start , char end , char mid){
        if(n == 0)
            return;

        towerOfHanoi(n - 1, start, mid, end);
        System.out.println("Moving the disk " + n + " from rod "+ start + " to rod "+ end);
        towerOfHanoi(n - 1, mid, end, start);
    }
}
