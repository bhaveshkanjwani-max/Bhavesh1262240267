import java.util.Scanner;
public class stringcount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1;
        char ch;
        System.out.println("enter a string : ");
        s1=sc.nextLine();
        int i,ncnt=0,acnt=0,scnt=0;
        for(i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(Character.isLetter(ch))
            {
                acnt=acnt+1;
            }
            else if(Character.isDigit(ch))
            {
                ncnt=ncnt+1;
            }
            else 
            {
                scnt=scnt+1;
            }

        }
        System.out.println(acnt);
        System.out.println(ncnt);
        System.out.println(scnt);
    }
}
