package ExceptionPrograms;

public class ArrayIndexOutOfBoundProgram {
	public static void main(String args[])
	{
		int arr[]= new int[10];
		try
		{
			arr[10]=40;
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception Handled");
	}

}
