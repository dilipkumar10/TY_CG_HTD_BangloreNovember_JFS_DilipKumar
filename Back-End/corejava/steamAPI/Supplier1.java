package steamAPI;

import java.util.function.Supplier;

public class Supplier1 {
public static void main(String[] args) {
	Supplier<Person> s=()->new Person(22,"Anu");
	System.out.println(s.get().getAge());
	System.out.println(s.get().getName());
}
}
