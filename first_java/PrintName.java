import java.util.Scanner;
public class PrintName {


	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String res = x.next();
		System.out.println("Hi " + res);
	}

}
