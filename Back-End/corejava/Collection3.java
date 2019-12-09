import java.util.*;

public class Collection3 
{
public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add(12);
	c.add(13);
	c.add(10);
	System.out.println(c);
	System.out.println("------------------------------");
	Collection c1=new ArrayList();
	c1.add(10);
	c1.add(56);
	c1.add(null);
	System.out.println(c1);

	c1.addAll(c);
	
	
	System.out.println("-------------------------------");
	
	Collection c2=new ArrayList();
	c2.add(12);

	c2.add(c1);
	Object a[]=c2.toArray();
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
}
}
