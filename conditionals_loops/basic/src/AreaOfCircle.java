class AreaOfCircle
{

	static double compute(int radius)

	{
		double pi = 3.14;
		return pi * Math.pow(radius, 2);
	}


	public static void main(String[] args)
	{
		double c = compute(4);
		System.out.println(c);
	}
}
