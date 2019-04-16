import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape{
	private int diameter1;
	private int diameter2;

	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
      super(color, filled);
      diameter1=d1;
      diameter2=d2;
     location=new Point[1];
     location[0]=pointUL;
	}
	public void draw(Graphics graphics)
	{
		if(isFilled())
		{
			graphics.fillOval(location[0].x,location[0].y, diameter1, diameter2);
		}
		else
		{
			graphics.drawOval(location[0].x,location[0].y, diameter1, diameter2);
		}
	}
	
	}
