import java.util.Scanner;
public class Factorial
{
    public static void main(String args [])
    {
        Scanner s1=new Scanner(System.in);
        int num,i,fact=1;
        System.out.println("enter a number : ");
        num=s1.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of number is : "+fact);
    }
}
