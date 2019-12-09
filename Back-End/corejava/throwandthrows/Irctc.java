package throwandthrows;

public class Irctc 
{
void confirmTicket() throws ClassNotFoundException
{
	try {
		Class.forName("Paytm");
		
	}
	catch(ClassNotFoundException e){
		System.out.println("not cofirmed");
	}
	
		
	
	
		
		
	
  
}
}
