class VolumeOfSphere
{

	static double compute(double radius)
	{
		double vol = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return vol;
	}

	public static void main(String[] args)
	{
		double vol = compute(9.0);
		System.out.println(vol);
	}

}
