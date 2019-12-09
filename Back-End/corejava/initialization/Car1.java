package initialization;

public class Car1 extends Vehicle
{
	int cost=2000;
public void carDetails()
{
	int cost=3000;
	System.out.println("local="+cost);
	System.out.println("sub="+this.cost);
	System.out.println("super="+super.cost);
}
}
