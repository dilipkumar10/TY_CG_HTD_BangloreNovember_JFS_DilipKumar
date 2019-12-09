package arraylistgroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListGrouping {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(11);
	a.add(20);
	a.add(33);
	
	List<Integer> l=a.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l);
	
	List<Integer> l1=a.stream().map(i->i*100).collect(Collectors.toList());
	System.out.println(l1);
	
	Optional<Integer> a1=a.stream().max((i,j)->i.compareTo(j));
	System.out.println(a1);
	
	System.out.println(a.stream().count());
	
	
	
	
}
}
