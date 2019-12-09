package throwandthrows;

public class Paytm 
{
Irctc i1;
Paytm(Irctc i1)
{
	this.i1=i1;
}
void bookTicket()
{
	try {
		i1.confirmTicket();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("not confirmed");
	}
}
}
