import java.awt.*;
import javax.swing.JFrame;

public class GFXsmilingFace extends Canvas
{
	public void paint (Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 400, 400);
		g.setColor(Color.blue);
		g.fillOval(300, 325, 50, 50);
		g.fillOval(450, 325, 50, 50);
		g.setColor(Color.red);
		g.drawArc(350, 450, 50, 25, 180, 180);		
	}
	public static void main (String[] args)
	{
		JFrame win = new JFrame("GFXsmilingFace");
		win.setSize(1000, 800);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GFXsmilingFace canvas = new GFXsmilingFace();
		win.add(canvas);
		win.setVisible(true);
		
	}
}