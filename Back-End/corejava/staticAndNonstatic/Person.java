package staticAndNonstatic;

public class Person 
{
static int age;
String name;
void personDetails()
{
System.out.println("person name is "+name +"and his age is "+age);
staticPersonDetails();
}
static void staticPersonDetails()
{
	System.out.println(age);
	//System.out.println(name);
}
void initialize(int age,String name)
{
	this.age=age;
	this.name=name;
}
}
