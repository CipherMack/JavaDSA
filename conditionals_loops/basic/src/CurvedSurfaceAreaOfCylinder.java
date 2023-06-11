class CurvedSurfaceAreaOfCylinder
{

	static double compute(double radius, double height)
	{
		double curved_area = 2 * Math.PI * radius * height;
		return curved_area;
	}

	public static void main(String[] args)
	{
		double curved_area = compute(9,5);
		System.out.println(curved_area);
	}

}
