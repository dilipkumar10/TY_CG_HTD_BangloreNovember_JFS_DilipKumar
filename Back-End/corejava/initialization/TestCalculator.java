package initialization;

public class TestCalculator
{
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println(c.add(10));
	System.out.println(c.add(10,20));
	System.out.println(c.add(10,20.33));
	System.out.println(c.add(10.33,20));
	System.out.println(Calculator.add(10,20,30));
	System.out.println(Calculator.add("Dilip"));
}
}
