package customcheckedexception;

public class AgeLimitException extends Exception 
{
	String msg;
   public AgeLimitException(String msg) 
   {
	 this.msg=msg;
   }
   public String getMessage()
   {
	   return msg;
   }
}
