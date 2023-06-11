class AreaOfParallelogram
{
	static double compute(int b, int h)
	{
		return b * h;
	}

	public static void main(String[] args)
	{
		double area = compute(9, 5);
		System.out.println(area);
	}
}
