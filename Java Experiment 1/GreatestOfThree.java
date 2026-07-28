import java.util.Scanner;
public class GreatestOfThree
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x,y,z;
        System.out.println("enter first number : ");
        x=sc.nextInt();
        System.out.println("enter second number : ");
        y=sc.nextInt();
        System.out.println("enter third number : ");
        z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("first number is greater : ");
            System.out.println(x);
        }
        else 
        {
            if(y>x && y>z)
            {
                System.out.println("second number is greater : ");
                System.out.println(y);
            }
            else
            {
                System.out.println("third number is greater : ");
                System.out.println(z);
            }   
        }
    }
}
