public class Palidrome {

	//Algorithm to reverse the string.
	static String reverseString(String s){

		if(s.isEmpty()){
			return s;
		}
		return reverseString(s.substring(1)) + s.charAt(0);
	}
	
	//Algorithm to check if palidrome.
	static boolean isPalidrome(String s1, String s2){
		s2 = reverseString(s2);
		return s1.equals(s2);

	}

	public static void main(String[] args){
		String example1 = "racecar";
		String example2 = "racecar";

		boolean x = isPalidrome(example1, example2);
		System.out.println("Result is: " + x);
	}
}
