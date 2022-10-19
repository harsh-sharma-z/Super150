public class Threadprac {
    public static void main(String[] args) throws InterruptedException {

        even e=new even();
        Thread t1=new Thread(e);
        t1.setPriority(10);
        t1.start();

        odd o=new odd();
        Thread t2=new Thread(o);
        t2.setPriority(1);

        t2.start();


    }
}
class odd implements Runnable
{

    public void run ()
    {
        for(int i=1;i<=20;i+=2)
            System.out.println(i);

    }
}
class even implements Runnable
{
    public void run()
    {
        for(int i=0;i<=20;i+=2)
            System.out.println(i);
    }
}
