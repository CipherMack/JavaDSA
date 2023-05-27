import java.util.Scanner;
public class SimpleInterest{

	public static void main(String[] args){

		Scanner interest_rate = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		float principal = interest_rate.nextFloat();
		System.out.println("Enter the interest rate: ");
		float rate = interest_rate.nextFloat();
		System.out.println("Enter the amount of time");
		float time = interest_rate.nextFloat();

		float result = (principal * rate * time) / 100;
		System.out.println("Your simple interest is: " + result);

	}

}
