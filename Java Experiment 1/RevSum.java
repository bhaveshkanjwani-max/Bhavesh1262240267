import java.util.Scanner;
public class RevSum
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int num,revnum=0,dig,sum=0,temp;
        System.out.println("enter a number : ");
        num=sc.nextInt();
        temp=num;
        while(num!=0)
        {
            dig=num%10;
            revnum=(revnum*10)+dig;
            num=num/10;
        }
        System.out.println("reversed number is : ");
        System.out.println(revnum);
        while(temp!=0)
        {
            dig=temp%10;
            sum=sum+dig;
            temp=temp/10;
        }
        System.out.println("Sum of digit is : ");
        System.out.println(sum);
    }
}
