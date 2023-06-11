class VolumeOfCylinder
{
	static double compute(double radius, double height)
	{
		double vol = Math.PI * Math.pow(radius, 2) * height;
		return vol;
	}

	public static void main(String[] args)
	{
		double vol = compute(5.0, 9.0);
		System.out.println(vol);
	}
}
