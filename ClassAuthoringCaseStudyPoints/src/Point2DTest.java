import static org.junit.Assert.*;

import org.junit.Test;

public class Point2DTest {
	
  
  @Test
  public void testAdd() {
    Point2D p1 = new Point2D();
    Point2D p2 = p1.add(3, 5);
    assertEquals("p1.x = 0", 0, p1.x, 0.001);
    assertEquals("p1.y = 0", 0, p1.y, 0.001);
    assertEquals("p2.x = 3", 3, p2.x, 0.001);
    assertEquals("p2.y = 5", 5, p2.y, 0.001);
  }
  
  @Test
  public void testTranslate() {
	Point2D p1 = new Point2D(2, 1);
	p1.translate(p1);
	assertEquals("p1.x = 4", 4, p1.x, 0.001);
	assertEquals("p1.y = 2", 2, p1.y, 0.001);
  }
  
  @Test
  public void testDistance() {
	  Point2D p1 = new Point2D(-3, 1);
	  p1.distance(3, -1);
	  assertEquals("p1.distance(3, -1) = Math.sqrt(40)", Math.sqrt(40), p1.distance(3, -1), 0.001);
  }
  
  @Test
  public void testToString() {
	  Point2D p1 = new Point2D();
	  assertEquals("p1.toString = Point(0.0, 0.0)", "Point(0.0, 0.0)", p1.toString());
  }
  
}