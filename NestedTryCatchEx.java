package ExceptionPrograms;

public class NestedTryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				int a[]=new int[5];
				a[6]=10;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			try
			{
				String str=null;
				int a=Integer.parseInt(str);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
