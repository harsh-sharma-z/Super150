package Bit_Manipulation;
import java.util.*;
public class Count_Good_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] c=sc.next().toCharArray();
        long even=0,odd=0;
        long[][] arr=new long[2][2];
        for(int i=1;i<=c.length;i++)
        {
            odd++;
            if(i%2!=0)
            {
                odd+=arr[c[i-1]-'a'][0];
                even+=arr[c[i-1]-'a'][1];
                arr[c[i-1]-'a'][0]++;

            }
            else {
                odd+=arr[c[i-1]-'a'][1];
                even+=arr[c[i-1]-'a'][0];
                arr[c[i-1]-'a'][1]++;
            }
        }

        System.out.println(even+" "+odd);
    }
}
