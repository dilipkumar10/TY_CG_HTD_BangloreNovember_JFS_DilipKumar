import java.util.Vector;

public class Vector3 
{
public static void main(String[] args) {
//	Vector v=new Vector();
//	v.add(23);
//	v.addElement(10);
//	v.addElement(20);
//	v.addElement(30);
//	v.add(40);
//	System.out.println(v);
//	v.removeElement(new Integer(10));
//	System.out.println(v);
//	v.removeElementAt(2);
//	System.out.println(v);
//	Integer[] k=new Integer[v.size()];
//	v.copyInto(k);
//	for(int i=0;i<k.length;i++)
//	{
//		System.out.println(k[i]);
//	}    
//	v.removeAllElements();
	Vector v=new Vector();
	v.add(20);
	v.add(21);
	v.setSize(4);;
	System.out.println(v.size());
	v.trimToSize();
	System.out.println(v.capacity());
	v.setSize(5);
	v.ensureCapacity(3);
	System.out.println(v.capacity());
}
}
