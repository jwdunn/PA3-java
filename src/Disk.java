/**
 * This is my disk class. it makes up the disk that is flung throught the level. in order to
 */



public class Disk extends Item {
	public long t;
	public long tc;
	public double y;
	private boolean crash;
	
	public Disk(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public void tossDisk(double iV, double agl)
	{
		agl = ConvertDegreesToRadians (agl);
		Velocity v = new Velocity( iV,  agl, this.getPosition());	
		t = System.currentTimeMillis();
		y = this.pt.getY();
		
		int count = 0;
		while (y>0 && !crash){
		count ++;	
		tc = System.currentTimeMillis();
		tc = (tc-t)/1000;
    	this.pt = v.getVelocity(tc);
		y = this.pt.getY();
		crash = crash(this.pt);
		if ( crash ){
			System.out.print("your disk hit a square and is now stuck!");
		}
		if (count == 800000){
			System.out.println(this.pt);
			count = 0;
		}
		}	
		System.out.println("the disk landed at" + this.pt);
	}
	 public static double ConvertDegreesToRadians (double degrees)
	    {
	      double radians = (Math.PI*degrees) / 180; 
	      return (radians);
	    }  
	
	
}
