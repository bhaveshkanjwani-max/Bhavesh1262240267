//package creation

package calculator;
public class usecalculator
{
    public void add(int nq,int nr)
    {
        int a=nq+nr;
        System.out.println("addition of numbers is : "+a);
    }
    public void sub(int mq,int mr)
    {
        int s=mq-mr;
        System.out.println("subtraction is : "+s);
    }
    public void mul(int av,int an)
    {
        int x=av*an;
        System.out.println("multiplication is : "+x);
    }
    public void div(int bb,int ba)
    {
        double d=bb/ba;
        System.out.println("divison is : "+d);
    }
}
//import package

import calculator.usecalculator;
public class caldemo
{
    public static void main(String args[])
    {
        usecalculator u=new usecalculator();
        u.add(12,2);
        u.sub(10,2);
        u.mul(2,5);
        u.div(10,2);
    }
}
