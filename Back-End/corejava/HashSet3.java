import java.util.HashSet;

public class HashSet3 {
public static void main(String[] args) {
	HashSet<Student> hs=new HashSet<Student>();
	hs.add(new Student(22,"Dilip"));
	hs.add(new Student(22,"Dili"));
	hs.remove(new Student(22,"Dilip"));
	//System.out.println(hs.Student.age);
	for (Student student : hs) {
		System.out.println(student.name);
	}
}
}
