package nestedtry1;


public class Exceptionc 
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		try {
			Object e2=e1.clone();
			try {
				Class c1=Class.forName("nestedtry1.Employee");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("class not found");
			}
		}
		catch(CloneNotSupportedException ne)
		{
			System.out.println("object not cloned");
		}
		
	}
}
