import java.awt.*;
import javax.swing.JFrame;

public class GFXcircle extends Canvas
{
	public void paint (Graphics g)
	{
			g.setColor(Color.green);
			g.drawOval(100, 10, 300, 300);
	}
	public static void main(String[] args)
	{
		JFrame win = new JFrame("GFXcircle");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GFXcircle canvas = new GFXcircle();
		win.add(canvas);
		win.setVisible(true);
	}
}