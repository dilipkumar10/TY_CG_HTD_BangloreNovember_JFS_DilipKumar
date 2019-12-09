package exceptionpropogation;

public class C 
{
static void c()
{
	try {
		System.out.println(10/0);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		throw e;
	}
	
}
}
