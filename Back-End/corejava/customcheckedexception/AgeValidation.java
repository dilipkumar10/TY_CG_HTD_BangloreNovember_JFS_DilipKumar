package customcheckedexception;

public class AgeValidation 
{
	int age;
	public AgeValidation(int age) {
		this.age=age;
	}
	void checkAge() throws AgeLimitException
	{
	if(age>18)
	{
		System.out.println("allowed for voting");
	}
	else
	{
		throw new AgeLimitException("not eligible for voting");
	}
}
}
