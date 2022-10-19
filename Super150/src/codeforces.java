
import javax.sound.midi.Soundbank;
import java.nio.file.LinkPermission;
import java.sql.SQLOutput;
import java.util.*;
public class codeforces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String s=sc.next();
            removeZero(s,0);

    }

    public static void removeZero(String s,int i) {
        if(i>=s.length())
            return;
        if(s.charAt(i)=='0')
            System.out.print("5");
        else
            System.out.print(s.charAt(i));

        removeZero(s,i+1);


    }
}




