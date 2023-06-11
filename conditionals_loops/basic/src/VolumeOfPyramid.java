class VolumeOfPyramid
{
	static double compute(double length, double width, double height)
	{
		double vol = (length * width * height) / 3.0;
		return vol;
	}

	public static void main(String[] args)
	{
		double vol = compute(7,8,9);
		System.out.println(vol);
	}
}
