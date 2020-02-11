import java.io.*;
public class BufferWriter2{
	public static void main(String[] args)throws Exception {
		FileWriter f3 = new FileWriter("Arun.txt");
		BufferedWriter b= new BufferedclsWriter(f3); 
		b.write("Arun Arun");
		b.close();
		System.out.println("Success");
	}
}