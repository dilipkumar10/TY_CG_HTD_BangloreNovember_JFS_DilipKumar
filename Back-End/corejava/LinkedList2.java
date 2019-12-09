import java.util.*;

public class LinkedList2 
{
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.addFirst(0);
	l1.addLast(40);
	System.out.println(l1);
	System.out.println("---------getfirst and getlast");
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	System.out.println(l1.remove());
	System.out.println(l1);
	l1.removeFirst();
	System.out.println(l1);
	l1.removeLast();
	System.out.println(l1);
	
	
	LinkedList l2=new LinkedList();
	l2.add(10);
	l2.add(10);
	l2.add(20);
	System.out.println(l2);
	l2.removeFirstOccurrence(10);
	System.out.println(l2);
	l2.removeLastOccurrence(10);
	System.out.println(l2);
	
}
}
