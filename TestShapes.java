import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;
public class TestShapes {
	



	Square s = new Square(new Point(20,20), 400, Color.CYAN, true);
	Rectangle r = new Rectangle(new Point(20,20), 400,500, Color.BLUE, true);
	RightTriangle r1 = new RightTriangle(new Point(20,20), 500, 400, Color.BLUE, true);
	IsoscelesTriangle I = new IsoscelesTriangle(new Point(20,20), 400,500, Color.WHITE, true);


	@Test
	
	public void RectangleTests()//tests for rectangle lass and its base classes   
	{


	Point[] points = new Point[4];
	points[0] = new Point(20,20);
	points[1] = new Point(10,20);
	points[2] = new Point(10,10);
	points[3] = new Point(20,10);
	Assert.assertEquals("incorrect color", Color.CYAN, s.getColor());
	Assert.assertEquals("incorrect value", true, s.isFilled());
	Assert.assertEquals("incorrect location", points, s.getLocation());

	
	Point[] points1 = new Point[4];
	points1[0] = new Point(20,20);
	points1[1] = new Point(20,30);
	points1[2] = new Point(30,30);
	points1[3] = new Point(30,20);
	Assert.assertEquals("incorrect color", Color.BLUE, r.getColor());
	Assert.assertEquals("incorrect value", true, r.isFilled());
	Assert.assertEquals("incorrect location", points1, r.getLocation());
	}
	@Test
	public void TriangleTests()  // tests for triangle class and its base classes 
	{
		
		Point[] points = new Point[3];
		points[0] = new Point(20,20);
		points[1] = new Point(30,20);
		points[2] = new Point(20,10);
		Assert.assertEquals("Incorrect color", Color.BLUE, r1.getColor());
		Assert.assertEquals("Incorrect value", true, r1.isFilled());
		Assert.assertEquals("Incorrect location", points, r1.getLocation());

		
		Point[] points1 = new Point[3];
		points1[0] = new Point(20,20);
		points1[1] = new Point(30,20);
		points1[2] = new Point(25,10);
		Assert.assertEquals("Color not correct", Color.WHITE, I.getColor());
		Assert.assertEquals("filled not correct", true, I.isFilled());
		Assert.assertEquals("Incorrect location", points1, I.getLocation());


		}
	}


