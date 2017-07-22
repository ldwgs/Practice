import java.util.Scanner;

public class ReverseString {
	private static String userInput;

	public ReverseString() {
		System.out.println("In this program, I'll take in a word and give you a reverse of it.");
		System.out.printf("Please give me a word: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		userInput = sc.nextLine();
		
		System.out.println("Your new word is: " + reverse(userInput));
	}
	
	public static String reverse(String input) {
		char[] in = input.toCharArray(); // splits the inputed string into a char array
		int begin = 0; // begin and end are counters 
		int end = in.length - 1;
		char temp; // temporary variable
		while(end > begin) { // this swaps the characters in place of their neighbors in the array
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in); // returns the newly formatted String
	}

}