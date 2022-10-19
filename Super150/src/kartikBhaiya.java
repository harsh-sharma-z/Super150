import java.util.*;
public class kartikBhaiya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.next();
        int val=Math.max(help(s,k,'a'),help(s,k,'b'));
        System.out.println(val);
    }
    public static int help(String s,int k,char ch) {
        int i=0,j=0,c=0,ans=0;
        while(j<s.length()) {
            if(s.charAt(j)==ch) {
                c++;

            }
            while(c>k) {
                if (s.charAt(i) == ch)
                    c--;
                i++;
            }
            ans=Math.max(ans,(j-i+1));

            j++;
        }
        return ans;
    }
}
