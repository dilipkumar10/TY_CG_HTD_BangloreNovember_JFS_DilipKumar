package throwkeyword;

public class GoogleMap 
{
void searchLocation(String a)
{
	try {
		System.out.println(a.length());
	}
	catch(NullPointerException n)
	{
		System.out.println(n.getMessage());
		throw new ArithmeticException("hello");
	}
	
}
}
