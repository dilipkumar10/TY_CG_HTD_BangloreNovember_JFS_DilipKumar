import java.util.*;

public class Collection1 
{
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(12);
		c.add("DILIP");
		c.add('a');
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.remove("DILIP");
		System.out.println(c);
		System.out.println(c.size());
	}
}
