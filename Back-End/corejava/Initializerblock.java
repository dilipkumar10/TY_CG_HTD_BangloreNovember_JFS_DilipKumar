
public class Initializerblock
{
 final int x;
 static final int y;
{
	
	System.out.println("block");
	x=13;
}
Initializerblock()
{
	System.out.println("hello");
}
Initializerblock(int x)
{
	System.out.println("bye");
}
void m1()
{
	System.out.println(x);
	
}
static
{
	System.out.println("static");
	y=10;
}
 
}
