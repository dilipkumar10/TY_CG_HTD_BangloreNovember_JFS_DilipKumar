
public class TestC
{
public static void main(String[] args) {
	System.out.println("main started");
	String a[]=new String[2];
	a[0]="hello";
	a[1]="bye";
	System.out.println(a[0]);
	try
	{
	a[2]="good";
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("main ended");
	}
}
}
