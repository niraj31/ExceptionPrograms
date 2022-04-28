package ExceptionPrograms;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}
class CustomExceptionEx
{
	void method1(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not a valid age to vote");
		}
		else
		{
			System.out.println("Go ahead to vote");
		}
	}
}

public class UserDefinedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionEx ce = new CustomExceptionEx();
		try
		{
			ce.method1(17);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("After Try Catch");
	}

}
