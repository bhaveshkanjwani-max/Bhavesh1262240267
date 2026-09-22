import java.util.Scanner;
class book
{
    String aut,tit,pub;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("enter author : ");
        aut=sc.next();
        System.out.println("enter title : ");
        tit=sc.next();
        System.out.println("enter publisher : ");
        pub=sc.next();
    }    
    void display()
    {
        System.out.println("author : "+aut);
        System.out.println("title : "+tit);
        System.out.println("publisher : "+pub);        
    }
}
class bookinfo extends book
{
    int pri,sp;
    void accept1()
    {
        accept();
        System.out.println("price : ");
        pri=sc.nextInt();
        System.out.println("stock position : ");
        sp=sc.nextInt();
    }
    void show()
    {
        display();
        System.out.println("price : "+pri);
        System.out.println("stock position : "+sp);
    }
}
public class singleinheritance
{
    public static void main(String args[])
    {
        bookinfo b1=new bookinfo ();
        b1.accept1();
        b1.show();
        bookinfo b2=new bookinfo();
        b2.accept1();
        b2.show();
        bookinfo b3=new bookinfo();
        b3.accept1();
        b3.show();
    }
}
