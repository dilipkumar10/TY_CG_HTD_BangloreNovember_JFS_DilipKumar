package nestedtry;

public class ExceptionB 
{
public static void main(String[] args) 
{
	String s=null;
try 
{
	System.out.println(10/2);
	try
	{
		System.out.println(s.length());
	}
	catch(NullPointerException f)
	{
		System.out.println("bye");
	}
	finally {
		System.out.println("finally 1");
	}
}
catch(Exception e)
{
	System.out.println("hello");
}
finally
{
	System.out.println("finally 2");
}

}
}
