import java.applet.*;
import java.awt.*;
public class DrawApplet extends Applet
 {
 	
 	public void paint(Graphics g){
 		g.drawOval(10,10,100,100);
 		g.drawRect(100,100,100,100);
 		 g.drawLine(30, 20, 30, 90);
 	}
 	public void stop(){}
 
}
/*
<applet code="DrawApplet.class" width="400" height="600">

</applet>

*/