import java.util.*;

public class List1 
{
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(0,10);
		l.add(1,null);
		l.add(2,20);
		l.add(3,15);
		l.add(4,10);
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(null));
		
		
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println("----------------------------");
		
		
		List l1=new ArrayList();
		l1.add(0,10);
		l1.add(1,20);
		 
		Collection c=new ArrayList();
		c.add(30);
		c.add(40);
		l1.addAll(1,c);
		System.out.println(l1);
		List l4=l1.subList(0, 2);
		System.out.println(l4);
		System.out.println("=============");
		
		
		List l7=new ArrayList();
		l7.add(0, 10);
		l7.add(1, 20);
		for(int i=0;i<l7.size();i++)
		{
			System.out.println(l7.get(i));
		}
		
	}



}
