package exceptionpropogation;

public class B 
{
static void b()
{
	try
	{
	C.c();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
