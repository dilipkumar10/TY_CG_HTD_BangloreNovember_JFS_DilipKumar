package staticAndNonstatic;

public class TestCalculator
{
public static void main(String[] args) {
	ScientificCalculator sc=new ScientificCalculator();
	sc.addition(20, 30);
	sc.subtraction(20, 10);
	sc.multiplication(10, 20);
	sc.division(20, 5 );
}
}
