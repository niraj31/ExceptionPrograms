package ExceptionPrograms;

public class MultipleCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a[]= new int[5];
			a[6]=10;
			int x=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("After Try Catch");

	}

}
