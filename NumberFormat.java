package ExceptionPrograms;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int x=Integer.parseInt(null);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception!");

	}

}
