import java.util.Scanner;
public class revstring
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string : ");
        s=sc.nextLine();
        String temp=s;
        StringBuffer sb = new StringBuffer(s);
        String s2 = sb.reverse().toString();
        System.out.println("reverse string is "+s2);
        if(s.equals(s2))
        {
            System.out.println("String is palindrome : ");
        }
        else
        {
            System.out.println("string is not palindrome : ");
        }
    }
}
