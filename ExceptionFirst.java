package ExceptionPrograms;

public class ExceptionFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("After Try Catch Block");

	}

}
