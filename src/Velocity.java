
import java.awt.geom.Point2D;

public class Velocity {
	public double vi;
	public double v;
	public double g;
	public double angle;
	private double y;
	private Point2D.Double p;
	
	public Velocity (double iV, double agl, Point2D.Double pt){
		vi = iV;
		v = 0;
		g = -9.8;
		angle = agl;
	    p = pt;
	}
	public Point2D.Double getVelocity(long time){
		
		y = vi*Math.sin(angle);
		y= y + g*time;	
		
		double v = vi * Math.cos(angle);
		double x = p.getX() + v*time;
		
	    Point2D.Double pt =new Point2D.Double(x,y);
	    return pt;
		}
		
	}
	


