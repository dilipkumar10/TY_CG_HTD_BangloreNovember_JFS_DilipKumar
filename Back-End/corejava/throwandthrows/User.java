package throwandthrows;

public class User 
{
public static void main(String[] args) {
	Irctc i1=new Irctc();
	Paytm m=new Paytm(i1);
	m.bookTicket();
	
}
}
