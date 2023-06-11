class AreaOfIsosceles
{
	static double compute(int h, int b)
	{
		return (1 * b * h) / 2;
	}

	public static void main(String[] args)
	{
		double area = compute(4,5);
		System.out.println(area);
	}
}
