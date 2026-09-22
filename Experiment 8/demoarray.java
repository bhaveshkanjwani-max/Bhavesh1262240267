public class demoarray
{
	public static void main(String args[])
	{
		  int arr[]={23,45,5,67,89};
		  try
		  {
			  System.out.println(arr[5]);
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("you can't access wrong index of array : ");
		  }
	}
}
