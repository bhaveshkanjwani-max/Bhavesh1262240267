//package creation
package employee;
public class foremployee
{
    public void gsalary(int b,int hra,int oa)
    {
        double gross=b+hra+oa;
        System.out.println("gross salary is : "+gross);
    }
    public void nsalary(int g,int td)
    {
        int net=g-td;
        System.out.println("net salary is : "+net);
    }
}

//import package
import employee.*;
public class displayresult
{
    public static void main(String args[])
    {
        foremployee f=new foremployee();
        f.gsalary(10000,5000,1000);
        f.nsalary(10000,500);
    }
}
