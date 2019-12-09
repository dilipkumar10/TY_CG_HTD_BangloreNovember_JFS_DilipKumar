package customuncheckedexception;

public class AtmSimulator 
{
void withdraw(double d)
{
	if(d>40000)
	{
		throw new DayLimitException("exceeded");
	}
	else {
		System.out.println("successful");
	}
}
}
