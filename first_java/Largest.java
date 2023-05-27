import java.util.Scanner;

public class Largest {


	public static void main(String[] args){

		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = user_input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = user_input.nextInt();
		int result = Math.max(num1, num2);
		System.out.println("The largest number is: " + result);
	}

}
