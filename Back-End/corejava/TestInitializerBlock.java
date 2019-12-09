
public class TestInitializerBlock 
{
public static void main(String[] args) {
	System.out.println("main");
	Initializerblock i=new Initializerblock();
	Initializerblock i1=new Initializerblock(10);
	i.m1();
	i1.m1();
	System.out.println(Initializerblock.y);
}
}
