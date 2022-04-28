package ExceptionPrograms;

public class FinallyBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] a = new int[5];
			a[5]=10;
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.println(e
					);
		}
		finally
		{
			System.out.println("Inside Finally Block");
		}

	}

}
