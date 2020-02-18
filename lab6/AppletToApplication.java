import java.awt.*;
public class AppletToApplication 
 {
 	AppletToApplication(){
 		int a=5;
 	}
 	public void paint(){
 		System.out.println("HEllO");
 		
 	}
 public static void main(String[] args) {
 	AppletToApplication obj=new AppletToApplication();
 	obj.paint();
 }
 
}