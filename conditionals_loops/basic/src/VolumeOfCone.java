class VolumeOfCone
{
	static double compute(double radius, double height)
	{
		double PI = 3.14;
		double vol = (PI*Math.pow(radius, 2)) * (height / 3);
		return vol;
	}

	public static void main(String[] args)
	{
		double vol = compute(9.0, 5.0);
		System.out.println(vol);
	}
}
