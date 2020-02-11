import java.io.FileReader;
public class File2{
	public static void main(String[] args)throws Exception {
		FileReader f2=new FileReader("Abiral.txt");
		int i;
		while((i=f2.read())!=-1)
		System.out.print((char)i);
		f2.close();
		
	}
}