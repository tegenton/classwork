import java.util.Scanner;

public class Switching {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What grade did you get?");
		char letterGrade;
		letterGrade = Character.toLowerCase(in.next().charAt(0));
		switch (letterGrade) {
		case 'a':
			System.out.println("You got between a 90 and 100");
			break;
		case 'b':
			System.out.println("You got between an 80 and 89");
			break;
		case 'c':
			System.out.println("You got between a 70 and 79");
			break;
		case 'd':
			System.out.println("You got between a 60 and 69");
			break;
		case 'f':
			System.out.println("You got between a 0 and 59");
			break;
		default:
			System.out.println("That's not a valid letter");
		}
		in.close();
	}

}
