import java.util.Scanner;
public class SumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("enter a number : ");
        x=sc.nextInt();
        System.out.println("enter second number : ");
        y=sc.nextInt();
        z=x+y;
        System.out.println("Sum of number is : "+z);
    }
}
