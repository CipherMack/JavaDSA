class PerimeterOfEquilateralTriangle
{
	static double compute(double side)
	{
		return 3 * side;
	}

	public static void main(String[] args)
	{
		double perim = compute(9);
		System.out.println(perim);
	}
}
