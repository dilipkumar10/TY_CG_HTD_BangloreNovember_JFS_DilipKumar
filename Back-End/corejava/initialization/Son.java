package initialization;

public class Son extends Father
{
Son()
{
	super(23,"Dilip");
	System.out.println("C");
}
Son(int x,String name)
{
	this();
	System.out.println("D");
}
}
