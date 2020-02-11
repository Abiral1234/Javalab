import java.io.FileWriter;
public class File1{
	public static void main(String[] args) {
		try{
		FileWriter f1=new FileWriter("Abiral.txt");
		f1.write("Hi i am abiral");
		f1.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("success");
	}
}