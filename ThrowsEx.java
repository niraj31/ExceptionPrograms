package ExceptionPrograms;

import java.io.*;
public class ThrowsEx {

	public static void method() throws FileNotFoundException
	{
		FileReader f = new FileReader("C:\\users\\abc.txt");
		BufferedReader bf = new BufferedReader(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("After Try Catch"
				+ "");

	}

}
