import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(10);
	v1.add(20);
	v1.add(30);
	v1.add(30);
	v1.add(null);
	System.out.println(v1);
	v1.set(4,6);
	System.out.println(v1);
	System.out.println(v1.remove(new Integer(10)));
	System.out.println(v1);
}
}
