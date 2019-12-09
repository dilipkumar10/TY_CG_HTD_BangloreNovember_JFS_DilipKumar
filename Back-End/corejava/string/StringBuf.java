package string;

public class StringBuf 
{
	public static void main(String[] args) {
//		StringBuffer s1=new StringBuffer("hello");
//		System.out.println(s1.hashCode());
//		s1=s1.append("world");
//		System.out.println(s1.hashCode());
		String s1=new String("hello");
		System.out.println(s1.hashCode());
		s1=s1.concat("world");
		System.out.println(s1.hashCode());
	}


}
