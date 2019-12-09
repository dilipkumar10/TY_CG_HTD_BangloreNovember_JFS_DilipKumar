import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs1=new HashSet();
	hs1.add(21);
	hs1.add(234);
	hs1.add(21);
	hs1.add(null);
	hs1.add(null);
	System.out.println(hs1);
	for (Object object : hs1) {
		System.out.println(object);
	}
	
	
	HashSet<String> hs2=new HashSet<String>();
	hs2.add("divya");
	hs2.add("nisha");
	hs2.add(null);
	hs2.add(null);
	System.out.println(hs2);
	
}
}
