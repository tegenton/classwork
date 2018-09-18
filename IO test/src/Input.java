import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String userInput = in.nextLine();
		
		System.out.println("Hello, " + userInput + "!");
		
		in.close();
	}

}
