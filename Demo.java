import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Demo {
psvm...
{
	JFrame frame =new JFrame("Graphics Demo");
	frame.setSize(new Dimension(400,400));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	MyPanel panel=new MyPanel();
	frame.add(panel);
	frame.setVisible(true);
}
private static class MyPanel extends JPanel
{
	@override
	protected void paintComponent(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRect(50, 50, 200, 100);
		g.setColor(Color.BLUE);
		g.fillRect(75, 75, 150, 150);
		g.setColor(Color.YELLOW);
		g.fillOval(50,  50,  100, 100);
	}
}
}
