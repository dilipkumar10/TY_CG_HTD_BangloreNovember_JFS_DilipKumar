package initialization;

public class Crush 
{
void receive(Phone p)
{
	p.open();
	if(p instanceof BaasicSet )
	{
		System.out.println("thanks");
	}
	else if(p instanceof Oppo )
	{
		System.out.println("thank you");
	}
	else if(p instanceof Oneplus )
	{
		System.out.println("thank you so much dear");
	}
	else
		System.out.println("i hate you");
}
}
