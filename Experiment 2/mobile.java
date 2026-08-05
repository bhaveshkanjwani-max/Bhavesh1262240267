public class mobile
{
    int ssize;
    String cname;
    mobile(int size,String name)
    {
        ssize=size;
        cname=name;
    }
    void display()
    {
        System.out.println("company name : "+cname);
        System.out.println("screen size : "+ssize);
    }
    public static void main(String args[])
    {
        mobile m1=new mobile(12,"redmi");
        m1.display();
        mobile m2=new mobile(23,"oneplus");
        m2.display();
    }
}
