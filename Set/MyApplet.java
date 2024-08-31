import java.applet.Applet;
import java.awt.Graphics;
public class  MyApplet extends Applet{
	public void paint(Graphics g){
		int num1=Integer.parseInt(getParameter("num1"));
		int num2=Integer.parseInt(getParameter("num2"));
		int num3=Integer.parseInt(getParameter("num3"));
		if(num1>num2 && num1>num3)
			g.drawString(num1+" is big",100,200);
		else if(num2>num3)
     		g.drawString(num2+" is big",100,200);
		else
			g.drawString(num3+" is big",100,200);

	}
}
