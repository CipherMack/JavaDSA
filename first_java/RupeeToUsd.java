import java.util.Scanner;

public class RupeeToUsd{


	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the amount of Rupee: ");
		float rupee = user_input.nextFloat();
		float usd = 0.01f;
		float result = rupee * usd;
		System.out.println("You have $" + result + " in USD");
			

	}
}
