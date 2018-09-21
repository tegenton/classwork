public class Operators {
    public static void main(String[] args) {
        int a = 1;
        int b = a + 3;
        int c = b - 7;
        int d = c * 9 * -1;
        int e = d / 3;
        int f = e % 4;

        System.out.println(a);                      // expected: 1
        System.out.println(b);                      // expected: 4
        System.out.println(c);                      // expected: -3
        System.out.println(d);                      // expected: 27
        System.out.println(e);                      // expected: 9
        System.out.println(f);                      // expected: 1

        int g = 50 / 100;
        double h = 50 / 100;
        double i = (double) 50 / 100;
        double j = (double) (50 / 100);

        System.out.println(g);                      // expected: 0
        System.out.println(h);                      // expected: 0.0
        System.out.println(i);                      // expected: 0.5
        System.out.println(j);                      // expected: 0.0

        System.out.println();
        System.out.println(1 + 1);                  // expected: 2
        System.out.println("1 + 1");                // expected: 1 + 1
        System.out.println("1 + 1 = " + 1 + 1);     // expected: 1 + 1 = 11
        System.out.println("1 + 1 = " + (1 + 1));   // expected: 1 + 1 = 2
    }
}