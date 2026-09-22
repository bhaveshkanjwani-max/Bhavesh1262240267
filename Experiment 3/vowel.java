import java.util.Scanner;
public class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        s1=sc.next();
        s1=s1.toLowerCase();
        System.out.println(s1);
        int i,cnt=0;
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
            {
                cnt=cnt+1;
            }
        }
        System.out.println("count of vowels is : "+cnt);
    }
}
