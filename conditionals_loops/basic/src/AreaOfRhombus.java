class AreaOfRhombus
{
	static float compute(int p, int q)
	{
		return (p * q) / 2f;
	}

	public static void main(String[] args)
	{
		float area = compute(9, 5);
		System.out.println(area);
	}
}
