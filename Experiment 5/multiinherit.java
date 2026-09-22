class book
{
    String tit,pub,aut;
    book(String tit1,String pub1,String aut1)
    {
        tit=tit1;
        pub=pub1;
        aut=aut1;
    }
    void display1()
    {
        System.out.println("title : "+tit);
        System.out.println("publisher : "+pub);
        System.out.println("author : "+aut);
    }
}
class bookinfo extends book
{
    int pri,sp;
    bookinfo(String tit1,String pub1, String aut1,int p1,int sp1)
    {
        super(tit1,pub1,aut1);
        pri=p1;
        sp=sp1;
    }
    void show()
    {
        display1();
        System.out.println("price : "+pri);
        System.out.println("stock position : ");
    }
}
class booksales extends bookinfo
{
    int nocs,rg;
    booksales(String tit1,String pub1, String aut1,int p1,int sp1,int nocs1)
    {   
        super(tit1,pub1,aut1,p1,sp1);
        nocs=nocs1;
    }
    void revenuegenerated()
    {
        rg=nocs*pri;
        System.out.println("revenue generated : "+rg);
    }
    void allshow()
    {
        System.out.println("number of copies sold : "+nocs);
    }
}
public class multiinherit
{
    public static void main(String args [])
    {
        booksales b1 = new booksales("abc","def","hij",100,23,50);
        b1.revenuegenerated();
        b1.allshow();
    }
}
