package Interfaceconcept;

public interface Lambda {
void m1(int x);
default void m2()
{
	System.out.println("fff");
}
}
