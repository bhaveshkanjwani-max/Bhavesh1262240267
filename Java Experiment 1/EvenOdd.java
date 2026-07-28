import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int num;
        System.out.println("enter a number : ");
        num=s1.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even : "+num);
        }
        else
        {
            System.out.println("Number is odd : "+num);
        }
    }
}
