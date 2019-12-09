package Interfaceconcept;

public class Son implements Father2,Father1
{

	@Override
	public void home() {
		Father2.super.home();
	}

}
