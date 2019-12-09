import java.util.Vector;

public class Vector2 
{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(78);
		v.add(100);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.trimToSize();
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.setSize(10);;
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		v.add(21);
		System.out.println(v.size());
		System.out.println(v);
		v.set(5, 21);
		System.out.println(v);
	}


}
