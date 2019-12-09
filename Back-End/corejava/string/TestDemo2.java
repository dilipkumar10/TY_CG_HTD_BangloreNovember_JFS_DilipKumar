package string;

public class TestDemo2 
{
public static void main(String[] args)
{
	Demo2 d=new Demo2("Dilip",22);
	System.out.println(d.hashCode());
	d=new Demo2("Dilip",22);
	System.out.println(d.hashCode());
	
}
}
