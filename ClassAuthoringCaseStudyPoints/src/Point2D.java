
public class Point2D {

	public double x;
	public double y;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D add(double dx, double dy) {
		return new Point2D(this.x + dx, this.y + dy);
	}
	
	public void translate(Point2D point) {
		this.x += point.x;
		this.y += point.y;
	}
	
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
	
	public String toString() {
		return "Point(" + this.x + ", " + this.y + ")";
	}

}
