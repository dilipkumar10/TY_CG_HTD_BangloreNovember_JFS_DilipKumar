import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinserting {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("C:\\Users\\Ravindra Gouda M\\Desktop\\input.txt");
		String s="hello suraj how are you";
		byte[] b=s.getBytes();
		System.out.println("success");
		try {
			f.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
