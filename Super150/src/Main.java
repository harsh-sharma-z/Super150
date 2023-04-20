import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] boys=new int[n];
        int[] girls=new int[m];
        System.out.println(minDiff(boys,girls,0,0));

    }
    private static int minDiff(int[] boys, int[] girls, int i,int j)
    {
        if(i==boys.length)
            return 0;
        if(j==girls.length)
            return 10000000;
        int pair=Math.abs(boys[i]-girls[j])+minDiff(boys,girls,i+1,j+1);
        int noPair=minDiff(boys,girls,i,j+1);
        return Math.min(pair,noPair);
    }
}


