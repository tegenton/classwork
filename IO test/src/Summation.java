import java.util.Scanner;

public class Summation {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Starting value: ");
    int start = in.nextInt();
    System.out.print("Ending value: ");
    int end = in.nextInt();
    System.out.print("Loop type (1 for a while loop, 2 for a do...while loop, and 3 for a for loop): ");
    int type = in.nextInt();
    in.close();
    
    int sum = 0;
    int i = start;
    
    switch (type) {
    case 1:
      while (i < end + 1) sum += i++;
      break;
    case 2:
      do {
        sum += i;
      } while (i++ < end);
      break;
    case 3:
      for (; i <= end; i++) sum += i;
      break;
    default:
      System.out.println("Invalid loop type");
      return;
    }
    System.out.println("The sum is " + sum);
  }
}
