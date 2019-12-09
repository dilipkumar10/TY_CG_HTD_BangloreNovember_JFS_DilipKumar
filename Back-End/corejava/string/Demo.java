package string;

public class Demo
{
	public static void main(String[] args) 
	{
		String s1=new String("hello");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(4));
		String s2="hello";
		System.out.println(s2.indexOf('l',3));
		String s4="ShreeShree";
		System.out.println(s4.indexOf("re",2 ));
	}


}
