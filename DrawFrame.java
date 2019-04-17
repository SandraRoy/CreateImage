import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	private static DrawPanel drawPanel;
	public DrawFrame(String title)
	{
		super(title);
		setSize(new Dimension(600,600));
		
		drawPanel=new DrawPanel();
		add(drawPanel);
		
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// create the shapes
		IsoscelesTriangle roof=new IsoscelesTriangle(new Point(200,300),140, 150,Color.RED, true);
		Square base = new Square(new Point(200,300),140,Color.YELLOW, true);
		Rectangle door=new Rectangle (new Point(250,440), 50,80, Color.RED, true);
		Circle pane =new Circle(new Point(250, 220),50,Color.WHITE, true);
		Rectangle riv=new Rectangle(new Point(0,560),600,80,Color.BLUE, true);
		Sinusoid river=new Sinusoid(Color.WHITE,new Point(0,520),600,3,18);
		Sinusoid river1=new Sinusoid(Color.WHITE,new Point(0,530),600,3,18);
		Oval body=new Oval(new Point (400,100),  100,  80, Color.orange, true);
		Circle eye =new Circle(new Point(420, 130),10,Color.BLACK, true);
		Circle eye1 =new Circle(new Point(480, 130),10,Color.BLACK, true);
		Sinusoid s=new Sinusoid(Color.BLACK,new Point(380,200),1,7,18);
		Diamond wing=new Diamond(new Point (300,120),90, Color.yellow,true);
		Diamond wing1=new Diamond(new Point (490,120),90, Color.yellow,true);
		RightTriangle g=new RightTriangle(new Point (0,480), 40, 70, Color.GREEN, true);
		RightTriangle g1=new RightTriangle(new Point (40,480), 40, 70, Color.GREEN, true);
		PolyLine p=new PolyLine(new Point(200,440), new Point(340,440), 50, Color.CYAN, true);
		RightTriangle g2=new RightTriangle(new Point (510,480), 40, 70, Color.GREEN, true);
		RightTriangle g3=new RightTriangle(new Point (550,480), 40, 70, Color.GREEN, true);
		// Add the shapes
		drawPanel.addShape(roof);
		drawPanel.addShape(base);
		drawPanel.addShape(door);
		drawPanel.addShape(pane);
		drawPanel.addShape(riv);
		drawPanel.addShape(river);
		drawPanel.addShape(river1);
		drawPanel.addShape(g);
		drawPanel.addShape(g1);
		drawPanel.addShape(body);
		drawPanel.addShape(wing);
		drawPanel.addShape(wing1);
		drawPanel.addShape(eye);
		drawPanel.addShape(eye1);
		drawPanel.addShape(s);
		drawPanel.addShape(p);
		drawPanel.addShape(g2);
		drawPanel.addShape(g3);
		
	}
	
	public static void main(String[] args) throws IOException
	{
		DrawFrame obj =new DrawFrame("Scene");
		PanelToImage.makePanelPNGImage(drawPanel, "SandraRoy_Image.png");
	}

}
