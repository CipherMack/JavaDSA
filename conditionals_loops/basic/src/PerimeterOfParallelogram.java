class PerimeterOfParallelogram
{
	static int compute(int base, int side)
	{
		int perim = 2 * (base + side);
		return perim;
	}

	public static void main(String[] args)
	{
		int perim = compute(9,5);
		System.out.println(perim);
	}
}
