
public class TestB 
{
	void write()
	{
		String s1=null;
		try
		{
		System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
		System.out.println("Dont deal");
		}
	}
	public static void main(String[] args) {
		TestB b=new TestB();
		b.write();
	}
}

