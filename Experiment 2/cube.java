public class cube
{
    int l,b,h;
    cube()
    {
        l=10;
        b=20;
        h=30;
    }
    cube(int l1,int b1,int h1)
    {
        l=l1;
        b=b1;
        h=h1;
    }
    cube(int l2,int b2)
    {
        l=l2;
        b=b2;
        h=15;
    }
    void display()
    {
        int v=l*b*h;
        System.out.println("Volume is : "+v);
    }
    public static void main(String args [])
    {
        cube c1=new cube();
        c1.display();
        cube c2=new cube(15,25,35);
        c2.display();
        cube c3=new cube(12,24);
        c3.display();
    }
}
