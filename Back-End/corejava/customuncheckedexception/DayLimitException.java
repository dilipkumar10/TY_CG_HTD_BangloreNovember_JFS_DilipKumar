package customuncheckedexception;

public class DayLimitException extends RuntimeException
{
	String msg;

	
	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
	
}
