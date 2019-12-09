import java.util.*;

public class LinkedList1 
{
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(1);
	l1.add(1);
	l1.add(null);
	l1.add(2);
	
	ListIterator ltr=l1.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	for(Object i:l1)
	{
		System.out.println(i);
	}
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
	LinkedList l2=new LinkedList();
	l2.add(1);
	l2.add(10);
	l2.addFirst(3);
	l2.addLast(234);
	l2.add(12);
	l2.push(11);
	System.out.println(l2.remove());
	System.out.println(l2);
	LinkedList<String> l3=new LinkedList<String>();
	l3.add("hello");
	System.out.println(l3);
}
}
