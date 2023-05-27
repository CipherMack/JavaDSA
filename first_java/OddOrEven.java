import java.util.Scanner;

public class OddOrEven {



public static void main(String[] args){
	
	System.out.println("Enter a number: ");
	Scanner user_input = new Scanner(System.in);
	int result = user_input.nextInt();
	if(result % 2 == 0){
		System.out.println("Number is even");
	}
	else{
		System.out.println("Number is odd");
	}

}

}
