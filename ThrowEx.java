package ExceptionPrograms;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		if(age<18)
		{
			throw new ArithmeticException("Not Valid to cast Vote");
		}
		
		
		else
		{
			System.out.println("Go ahead to Vote");
		}

	}

}
