package string;

public class Assignment 
{
	public static void main(String[] args)
	{
		String s1=new String("hello");
		String s2=new String("hello world");
		String s3=new String("HELLO");
		String s4=new String("hello");
		System.out.println(s1.charAt(3));
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.codePointBefore(1));
		//System.out.println(s1.codePointCount(0,3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.concat(s2));
		System.out.println(s2.contains(s1));
		System.out.println(s1.contentEquals(s4));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.getBytes());
		System.out.println(s1.hashCode());
		System.out.println(s1);
		System.out.println(s1.indexOf('l'));
		System.out.println(s2.lastIndexOf('l'));
		System.out.println(s2.indexOf('l', 5));
		//System.out.println(s2.lastIndexOf('l', 5));
		System.out.println(s1.length());
		System.out.println(s2.substring(2,7));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		//System.out.println(s1.replaceAll(s1, s2));
		System.out.println(s1.replace('l', 'b'));
		System.out.println(s1);
		String[] str=s2.split(" ");
		System.out.println(str[1]);
		}

}
