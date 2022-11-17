package RandomiseQuickSort;

public class PowerLogN {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(Power(a,b));
    }
    public static int Power(int a,int b)
    {
        if(b==0)
            return 1;

        int ans=Power(a,b/2);
        if(b%2==1)
        ans=ans*a;

        return ans;
    }
}
