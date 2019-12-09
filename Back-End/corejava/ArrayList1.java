import java.util.*;

public class ArrayList1 
{
public static void main(String[] args) {
	List<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(10);
	System.out.println(a1);
	a1.remove(new Integer(10));
	System.out.println(a1);
	for(Integer i:a1)
	{
		System.out.println(i);
	}
	Iterator itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	ListIterator itr1=a1.listIterator(a1.size());
	while(itr1.hasPrevious())
	{
		System.out.println(itr1.previous());
	}

}
}
