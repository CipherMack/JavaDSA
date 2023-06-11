class PerimeterOfCircle
{
	static double compute(double radius)
	{
		
		return 2 * Math.PI * radius; 
	}

	public static void main(String[] args)
	{
		double perimeter = compute(9);
		System.out.println(perimeter);
	}
}
