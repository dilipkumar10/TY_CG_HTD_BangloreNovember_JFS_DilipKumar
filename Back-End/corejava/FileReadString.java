import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadString {
public static void main(String[] args) {
	try {
		FileInputStream f=new FileInputStream("C:\\Users\\Ravindra Gouda M\\Desktop\\input.txt");
//		int j=f.read();
//		System.out.println((char)j);
		int j=0;
		while((j=f.read())!=-1) {
			System.out.print((char)j);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
