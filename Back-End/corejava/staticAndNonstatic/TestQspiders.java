package staticAndNonstatic;

public class TestQspiders 
{
public static void main(String[] args) {
	Qspiders btr=new Qspiders();
	btr.swipe();
	btr.swipe();
	Qspiders hebbal=new Qspiders();
	hebbal.swipe();
	System.out.println(Qspiders.totalCount);
	System.out.println(btr.branchCount);
	System.out.println(hebbal.branchCount);
}
}
