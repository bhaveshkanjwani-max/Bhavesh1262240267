import java.util.Scanner;
public class Arithematic
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,ch;
        System.out.println("enter first number : ");
        x=sc.nextInt();
        System.out.println("enter second number : ");
        y=sc.nextInt();
        
        do
        {
            System.out.println("\n1:-to add : \n2:-to subtract : \n3:-to multiply : \n4:-to divide : \n5:-to find remainder : \n6:-to exit : \nenter your choice :");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    z=x+y;
                    System.out.println("Addition is : ");
                    System.out.println(z);
                    break;
                case 2:
                    z=x-y;
                    System.out.println("Subtraction is : ");
                    System.out.println(z);
                    break;
                case 3:
                    z=x*y;
                    System.out.println("Multiplication is : ");
                    System.out.println(z);
                    break;
                case 4:
                    z=x/y;
                    System.out.println("Divison is : ");
                    System.out.println(z);
                    break;
                case 5:
                    z=x%y;
                    System.out.println("Remainder is : ");
                    System.out.println(z);
                    break;
                case 6:
                    System.out.println("byeee");
                    break;
                    default:
                        System.out.println("Invalid choice");
            }
        }while(ch!=6);
    }
}
