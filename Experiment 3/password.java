import java.util.Scanner;
public class password
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s1,s2="hello123";
        System.out.println("enter password : ");
        s1=sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("password is correct : "+s1);
        }
        else
        {
            System.out.println("incorrect password : "+s1);
        }
    }
}
