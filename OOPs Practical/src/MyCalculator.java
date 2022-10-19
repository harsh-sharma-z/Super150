import java.util.*;
class NegativeValueException extends Exception
{
    public NegativeValueException(String msg)
    {
        super(msg);
    }

}
class ZeroValueException extends Exception
{
    public ZeroValueException(String msg)
    {
        super(msg);
    }
}
public class MyCalculator
{
    public static long power(int n,int p) throws NegativeValueException, ZeroValueException
    {
        int num=n;
        int pow=p;
        if(pow==0 || num==0)
            throw new ZeroValueException("Base number or power should not be zero!");
        else
        if(pow<0 || num<0)
            throw new NegativeValueException("Base number or power should not be a negative number!");
        else
        {
            long ans=1;
            for(int i=0;i<pow;i++)
                ans=ans*num;
            return ans;
        }


    }

    public static void main(String[] args) {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter base number:");
            int n=sc.nextInt();
            System.out.println("Enter power:");
            int p=sc.nextInt();
            System.out.println("Answer is="+power(n,p));
        }
        catch(NegativeValueException  e)
        {
            System.out.println(e);
        }
        catch(ZeroValueException e)
        {
            System.out.println(e);
        }
    }
}

