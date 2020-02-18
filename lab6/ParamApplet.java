import java.applet.*;
import java.awt.*;
public class ParamApplet extends Applet
 {
 	
 	public void paint(Graphics g){
 		String a=getParameter("Abiral");
 		String b=getParameter("ABC");
 		g.drawString("Abiral "+a,50,50);
 		g.drawString("Rollno "+b,50,70);
 	}
 
}
/*
<applet code="ParamApplet.class" width="400" height="600">
<param name="Abiral" value="Pokhrel">
<param name="ABC" value="4">
</applet>

*/