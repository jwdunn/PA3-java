/** 
 * Jared Dunn
 * pa3
 * this is my colide interface. it has the methods crash and get position. all objects must have these methods defined.
 * 
 */


import java.awt.geom.Point2D;


public interface collide {
	
public boolean crash(Point2D.Double p);

public Point2D.Double getPosition();

}


