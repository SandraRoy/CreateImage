import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle {
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color,boolean filled)
	{
		super(pointLB, color, filled);
		location=new Point[3];
		location[0]=pointLB;
		location[1]=new Point((int)(pointLB.getX()+base), (int)(pointLB.getY()));
		location[2]=new Point((int)(pointLB.getX()+base/2), (int)(pointLB.getY()-height));
		
	}

}
