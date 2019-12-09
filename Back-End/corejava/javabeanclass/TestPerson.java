package javabeanclass;

public class TestPerson 
{
public static void main(String[] args) {
	Person p=new Person();
	p.setAge(18);
	p.setName("pavan");
	System.out.println(p.getAge());
	System.out.println(p.getName());
}
}
