
public class Calculator
{
void divide(int a ,int b)
{
	System.out.println("divided started");
	try
	{
		System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Donot divide by zero");
	}
	
	System.out.println("divided ended");
}

}
