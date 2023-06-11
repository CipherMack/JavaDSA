class AreaOfTriangle
{
	static double compute(int Hb, int base)
	{
		double area = (base * Hb) / 2;
		return area;
	}

	public static void main(String[] args)
	{
	
		double area = compute(8, 5);
		System.out.println(area);

	}
}
