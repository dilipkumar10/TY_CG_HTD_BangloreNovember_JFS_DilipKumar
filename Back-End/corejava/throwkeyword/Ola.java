package throwkeyword;

public class Ola 
{
	GoogleMap g1;
public Ola(GoogleMap g1) {
		this.g1=g1;
	}
void find(String s)
{
	try {
		g1.searchLocation(s);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}
}
