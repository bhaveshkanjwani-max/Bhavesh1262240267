class forw extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class rev extends Thread
{
    public void run()
    {
        for(int i=10;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
public class  threaddemo
{
    public static void main(String args[])
    {
        forw f=new forw();
        rev r=new rev();
        f.start();
        r.start();
    }
}
