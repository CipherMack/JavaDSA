class AreaOfEquilateralTriangle
{
	static double compute(int a)
	{
		return (Math.sqrt(3) / 4) * Math.pow(a, 2);
	}

	public static void main(String[] args)
	{
		double  area = compute(9);
		System.out.println(area);
	}
}
