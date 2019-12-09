package initialization;

public class Employee
{
String name;
int age;
int salary;
Employee(String name,int age,int salary)
{
	this.name=name;
	this.age=age;
	this.salary=salary;
}
void employeeDetails()
{
System.out.println("empname is = "+name+" empsal = "+salary+" empage = "+age);	
}
}
