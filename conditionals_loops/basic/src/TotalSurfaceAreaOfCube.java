class TotalSurfaceAreaOfCube
{
	static double compute(double area)
	{
		double surface_area = 6 * Math.pow(area, 2);
		return surface_area;
	}

	public static void main(String[] args)
	{
		double surface_area = compute(9);
		System.out.println(surface_area);
	}

}
