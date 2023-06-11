class PerimeterOfRhombus
{
	static int compute(int side)
	{
		return 4 * side;
	}

	public static void main(String[] args)
	{
		int perim = compute(4);
		System.out.println(perim);
	}
}
