import java.util.Vector;

public class Vector4 
{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		System.out.println(v);
		v.ensureCapacity(4);
		v.trimToSize();
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.setSize(5);
		System.out.println(v.capacity());

	}
}
