package steamAPI;

public class Function {
	public static void main(String[] args) {
		java.util.function.Function<Integer, Integer> f=(i)->i*100;
		//int a=f.apply(100)---------autounboxing
		System.out.println(f.apply(10));

	}
}
