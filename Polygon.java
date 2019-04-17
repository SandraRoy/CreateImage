import java.awt.Color;
import java.awt.Graphics;

public class Polygon extends Shape
{
	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}
	public void draw(Graphics graphics)
	{
		int[] xPoints = new int[location.length];	
		int [] yPoints=new int[location.length];

		for(int i=0;i<location.length;i++)
		{
			xPoints[i]=(int) location[i].getX();
			yPoints[i]=(int)location[i].getY();
		}
		graphics.setColor(getColor());

		if(isFilled())
		{
			graphics.fillPolygon(xPoints, yPoints, location.length);
		}
		else
		{
			graphics.drawPolygon(xPoints, yPoints, location.length);
		}
	}
}
