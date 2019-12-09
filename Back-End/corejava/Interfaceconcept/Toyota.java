package Interfaceconcept;

interface Toyota 
{
double cost=30000;
void design();
void engine();
  public default void juice()
   {
	   System.out.println("baa");
   }
   static void close()
   {
	   System.out.println("closed");
   }
  
}
