public class Point3d
{
	private double XCoord;
	private double YCoord;
	private double ZCoord;

	public Point3d()
	{
   		XCoord=YCoord=ZCoord=0;
	}

	public Point3d(double a,double b,double c)
	{
   		XCoord=a;
  		YCoord=b;
   		ZCoord=c;
	}

	public double OutX()
	{
		return XCoord;
	}
	public double OutY()
	{
		return YCoord;
	}
	public double OutZ()
	{
		return ZCoord;
	}

	public void InX(double a)
	{
		XCoord=a;
	}
	public void InY(double b)
	{
		YCoord=b;
	}
	public void InZ(double c)
	{
		ZCoord=c;
	}

	public boolean equal(Point3d a)
	{
		if ((a.OutX()==XCoord)&&(a.OutY()==YCoord)&&(a.OutZ()==ZCoord))
		{
			return true;
		}
		return false;
	}

	public double distanceTo(Point3d a)
	{
		return Math.sqrt(Math.pow((a.OutX()-XCoord),2)+Math.pow((a.OutY()-YCoord),2)+Math.pow((a.OutZ()-ZCoord),2));
	}
}