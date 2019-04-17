import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle 
{
	public Square(Point pointUL, int width, Color color, boolean filled)
	{
		super(pointUL, width, width, color, filled);
		location[0]=pointUL;
		location[1]=new Point((int)(pointUL.getX()+width),(int)(pointUL.getY()));
		location[2]=new Point((int)(pointUL.getX()+width),(int)(pointUL.getY()+width));
		location[3]=new Point((int)(pointUL.getX()), (int)(pointUL.getY()+width));
	}
}
