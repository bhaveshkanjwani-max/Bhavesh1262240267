public class demowrap
{
    public static void main(String args[])
    {
        String s="1000";
        Integer a=100;
        System.out.println("string is : "+s);
        System.out.println("integer : "+a);
        int b=Integer.parseInt(s);
        System.out.println("value of : "+Integer.valueOf(s));
        String g=a.toString();
        System.out.println(g);
    }
}
