package staticAndNonstatic;

public class TestPerson 
{
public static void main(String[] args) {
	Person p1=new Person();
	p1.name="dilip";
	Person.age=23;
	p1.personDetails();
	Person p2=new Person();
	p2.initialize(24,"shiva");
	p2.personDetails();
	
}
}
