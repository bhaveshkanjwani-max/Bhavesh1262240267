public class demoexam
{
	public static void main(String args[])
	{
		int num;
		try
		{
			num=10/0;	
		}
		catch(ArithmeticException e)
		{
			System.out.println("you can't divide a number by 0 : ");
		}
		finally
		{
			System.out.println("code got executed : ");
		}
	}
}
