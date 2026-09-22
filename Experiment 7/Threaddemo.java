class even extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
class odd extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
public class  Threaddemo
{
    public static void main(String args[])
    {
        even f=new even();
        odd r=new odd();
        f.start();
        r.start();
    }
}
