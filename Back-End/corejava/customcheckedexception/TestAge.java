
package customcheckedexception;

public class TestAge 
{
public static void main(String[] args) throws AgeLimitException {
	AgeValidation a= new AgeValidation(17);
	try
	{
	a.checkAge();
	}
	catch(AgeLimitException e)
	{
		System.out.println(e.getMessage());
	}
}
}
