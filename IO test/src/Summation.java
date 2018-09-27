import java.util.Scanner;

public class Summation {
  public static void main(String[] args) {
    Scanner in = new Scanner(system.in);
    System.out.print("Starting value: ");
    int start = in.nextInt();
    System.out.print("Ending value: ");
    int end = in.nextInt();
    System.out.print("Loop type (1 for a while loop, 2 for a do...while loop, and 3 for a for loop): ");
    int type = in.nextInt();
    switch (type) {
    case 1:
      // TODO: while
      break;
    case 2:
      // TODO: do while
      break;
    case 3:
      // TODO: for
      break;
    default:
      System.out.println("Invalid loop type");
    }
  }
}
