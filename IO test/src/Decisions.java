import java.util.Scanner;

public class Decisions {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("What grade did you get?");
		double grade; char letter;
		while ((grade = in.nextDouble()) > 100 || grade < 0);
		if (grade >= 90) letter = 'A';
		else if (grade >= 80) letter = 'B';
		else if (grade >= 70) letter = 'C';
		else if (grade >= 60) letter = 'D';
		else letter = 'F';
		System.out.println("You got a(n) " + letter );
		in.close();
	}
}
