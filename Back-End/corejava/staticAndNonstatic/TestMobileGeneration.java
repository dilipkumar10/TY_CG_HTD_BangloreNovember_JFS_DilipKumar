package staticAndNonstatic;

public class TestMobileGeneration
{
public static void main(String[] args) {
	/*FirstGeneration fg=new FirstGeneration();
	fg.call();
	fg.msg();
	SecondGeneration sg=new SecondGeneration();
	sg.call();
	sg.msg();
	sg.radio();
	ThirdGeneration tg=new ThirdGeneration();
	tg.call();
	tg.msg();
	tg.camera();
	tg.radio();*/
	FirstGeneration fg=new ThirdGeneration();
	fg.call();
	fg.msg();
	SecondGeneration sg=new ThirdGeneration();
	sg.call();
	sg.msg();
	sg.radio();
	FirstGeneration gg=new SecondGeneration();
	gg.call();
	gg.msg();
	
	
}
}
