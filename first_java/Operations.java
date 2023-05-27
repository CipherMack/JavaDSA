import java.util.Scanner;

public class Operations{

	public static void main(String[] args){
		//Assign operations.
		char plus = '+';
		char minus = '-';
		char multiply = '*';
		char divide =  '/';
		
		//Create scanner object.
		Scanner user_input = new Scanner(System.in);
		
		//Command line sequence.
		System.out.println("Enter 1st number: ");
		float num1 = user_input.nextFloat();
		
		System.out.println("Enter 2nd number: ");
		float num2 = user_input.nextFloat();
		
		System.out.println("Enter desired operation (+, -, *, /): ");
		String ops = user_input.next();
		
		//Conditional operation assignments.
		float result = 0;
		if(ops.equals(String.valueOf(plus)))
			result = num1 + num2;
		if(ops.equals(String.valueOf(minus)))
			result = num1 - num2;
		if(ops.equals(String.valueOf(multiply)))
			result = num1 * num2;
		if(ops.equals(String.valueOf(divide)))
			result = num1 / num2;
		System.out.println("The operational result: " + result);
	}

}
