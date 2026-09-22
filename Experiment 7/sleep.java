class even extends Thread
{
    public void run()
    {
        for(int i=1; i<=20; i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(10000);
            }
            catch(InterruptedException e)
            {
            }
        }
    }
}

class rev extends Thread
{
    public void run()
    {
        for(int i=20; i>=1; i--)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
            }
        }
    }
}

public class sleep
{
    public static void main(String args[])
    {
        even e = new even();
        rev r = new rev();

        e.start();
        r.start();
    }
}
