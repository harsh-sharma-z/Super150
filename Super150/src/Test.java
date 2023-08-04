import java.util.*;
import java.io.*;
public class Test
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\harsh\\Downloads\\inp.txt");
        Scanner sc = new Scanner(file);
        long ans = -1;
        long sum = 0;
        long max=0;

        while(sc.hasNextLine()){
            String s = sc.nextLine();

            if(s.length() == 0 || s.equals('\n')){
                if(sum > max){
                    max = sum;
                    ans = max;
                }
                sum=0;
            }
            else {
                long in = Long.parseLong(s);
                sum += in;
            }

        }

        System.out.println(ans);


    }
}

