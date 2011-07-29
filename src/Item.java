

import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class Item implements collide{
	protected Point2D.Double pt;
	private int width;
	private int halfWidth;
	private boolean swtch;
	
	public Item (double a, double b){
		pt = new Point2D.Double (a,b);
		width = 3;
		halfWidth = width/2;
		swtch = false;
			
	}

	public boolean crash(Point2D.Double p){
		
		ArrayList<Point2D.Double> dim = new ArrayList<Point2D.Double>();
		
		Point2D.Double left = new Point2D.Double(pt.getX()-halfWidth, pt.getY());
		dim.add(left);
		Point2D.Double right = new Point2D.Double(pt.getX()+halfWidth, pt.getY());
		dim.add(right);
		Point2D.Double top = new Point2D.Double(pt.getX(), pt.getY()+halfWidth);
		dim.add(top);
		Point2D.Double bottom = new Point2D.Double(pt.getX(), (int)pt.getY()-halfWidth);
		dim.add(bottom);
		
		for (int i = 0; i<4; i++){
			if(dim.get(i).equals(p)){
				swtch = true;
			} 
		}
		return swtch;	
		}

	public Point2D.Double getPosition(){
		
	return pt;
	}
	
	public int getWidth(){
		return width;
	}
	 
}
