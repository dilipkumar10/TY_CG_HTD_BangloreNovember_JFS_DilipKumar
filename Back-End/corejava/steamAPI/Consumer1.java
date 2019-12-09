package steamAPI;

import java.util.function.Consumer;

public class Consumer1 {
public static void main(String[] args) {
	Person p=new Person(13,"akshay");
	Consumer<Person> c=j->{
	System.out.println(j.getAge());
	System.out.println(j.getName());
	};
	c.accept(p);	
}
}
