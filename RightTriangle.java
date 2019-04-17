import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle {
	public RightTriangle(Point pointRA, int width, int height, Color color, boolean filled )
	{
		super(pointRA, color, filled);
		location =new Point[3];
		
		location[0]=pointRA;
		location[1]=new Point((int)(pointRA.getX()+width), (int)(pointRA.getY()));
		location[2]=new Point((int)(pointRA.getX()),(int)(pointRA.getY()-height));

}
}