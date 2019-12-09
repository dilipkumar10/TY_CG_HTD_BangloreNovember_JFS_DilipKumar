package boxingandunboxing;

public class BoxUnbox 
{
public static void main(String[] args) {
	int i1=10;
	Integer i2=new Integer(i1);
	int i3=i2.intValue();
	int i4=(int)i3;
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
}
}
