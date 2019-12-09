package initialization;

public class Father 
{
Father()
{
	System.out.println("A");
}
Father(int x,String y)
{
	this(); 
	System.out.println("B");
}
}
