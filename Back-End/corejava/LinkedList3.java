import java.util.LinkedList;

public class LinkedList3 
{
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.pollFirst());
	System.out.println(l1);
	System.out.println(l1.pollLast());
	System.out.println(l1);
	l1.offer(10);
	l1.offer(20);
	System.out.println(l1);
	l1.offerFirst(9);
	l1.offerLast(23);
	System.out.println(l1);
	l1.push(11);
	System.out.println(l1);
	System.out.println(l1.pop());
	System.out.println(l1);
	System.out.println(l1.element());
}
}
