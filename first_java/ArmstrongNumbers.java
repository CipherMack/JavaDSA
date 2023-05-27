import java.io.*;
import java.math.*;


public class ArmstrongNumbers
{

	static void GetNumbers(int num1, int num2)
	{
		for(int i = num1 + 1; i < num2; i++)
		{
			int y = i;
			int n = 0;

			while(y != 0)
			{
				y /= 10;
				n++;
			}
			int power_sum = 0;
			y = i;
			while(y != 0)
			 {
				int d = y % 10;
				power_sum += Math.pow(d, n);
				y /= 10;
			 }

			if(power_sum == i)
				System.out.println(i + " ");
		}
	}

	public static void main(String[] args)
	{
		int num1 = 50;
		int num2 = 500;
		GetNumbers(num1, num2);
		System.out.println();
	}

}
