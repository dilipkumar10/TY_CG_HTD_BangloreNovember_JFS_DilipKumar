package customuncheckedexception;

public class TestAtm 
{
public static void main(String[] args) 
{
	AtmSimulator a=new AtmSimulator ();
	try {
		a.withdraw(45000);
	}
	catch(DayLimitException e){
		System.out.println(e.getMessage());
	}
	
}
}
