package checkedException;

public class ExceptionB 
{
public static void main(String[] args) {
	Student s1=new Student();
	try {
		Object s2=s1.clone();
		System.out.println("object cloned");
		Class c2=Class.forName("checkedException.Student");
	} catch (CloneNotSupportedException e) {
		
	System.out.println("clone not supported");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("class not found");
	}
}
}
