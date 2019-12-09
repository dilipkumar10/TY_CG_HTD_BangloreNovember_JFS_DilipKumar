import java.util.*;

public class ArrayList2 
{
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("dilip");
	a1.add("akshay");
	a1.add("manvi");
	a1.add("akshay");
	System.out.println(a1);
	a1.remove("akshay");
	System.out.println(a1);
	System.out.println(a1.size());
	Iterator i=a1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("----------------------");
	ListIterator l=a1.listIterator();
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	System.out.println("================================");
	while(l.hasPrevious())
	{
		System.out.println(l.previous());
	}
	ArrayList a2=new ArrayList();
	a2.add(10);
	a2.add("sunitha");
	a1.addAll(a2);
	System.out.println(a1);
	a1.removeAll(a2);
	System.out.println(a1);
	a1.add(1, "sunitha");
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	System.out.println(a1.indexOf("sunitha"));
	System.out.println(a1.get(2));
	ArrayList a3=new ArrayList();
	a3.add("ravi");
	a1.addAll(1, a3);
	System.out.println(a1);
	System.out.println();
	a1.set(2, "sunitha");
	System.out.println(a1);
	System.out.println(a1.subList(0, 2));
	System.out.println(a1.isEmpty());
	
	
	
}
}
