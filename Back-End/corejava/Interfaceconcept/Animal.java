package Interfaceconcept;

public interface Animal 
{
	void eat(int a);
	//void eat();
	//void eat(int a,int b);
	default  void add()
	{
		System.out.println("gunar");
	}
	static void man()
	{
		System.out.println("bye");
	}
	@Override
	public String toString();
}
