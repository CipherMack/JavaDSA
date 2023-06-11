class PerimeterOfRectangle
{
	static int compute(int length, int width)
	{
		int perim = 2 * (length + width);
		return perim;
	}

	public static void main(String[] args)
	{
		int perim = compute(9,5);
		System.out.println(perim);
	}
}
