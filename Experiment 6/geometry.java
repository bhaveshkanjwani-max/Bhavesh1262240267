//package creation 

package geometry;
public class geometry
{
    public void calareac(int r)
    {
        double a=3.1415*r*r;
        System.out.println("area of rectangle is : "+a);
    }
    public void calarear(int l,int b)
    {
        double ar=l*b;
        System.out.println("area of rectangle is : "+ar);
    }
}

//package import 

import geometry.*;
public class calcarea
{
    public static void main(String args [])
    {
        geometry u1 = new geometry();
        u1.calareac(4);
        u1.calarear(2,5);
    }
}
