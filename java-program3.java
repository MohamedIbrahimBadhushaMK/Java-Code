// Program to generate a number of fibinacci terms
// Time Complexity: O(n), Space Complexity: O(1)
import java.util.Scanner;
public class FibonacciGenerator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number of terms: ");
    int terms = scan.nextInt();
    int a = 0, b = 1;
    for (int i = 0; i < terms; i++) {
      System.out.print(a + " ");
      b = a + b;
      a = b - a;
    }
    scan.close();
  }
}
