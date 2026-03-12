// Program to print the factorial of a given input.
// Time Complexity: O(n), Space Complexity: O(1)
import java.util.Scanner;
public class FactorialCalculator {
  static long factorial(int n) {
    long result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int num = scan.nextInt();
    System.out.println("Factorial of " + num + " is: " + factorial(num));
    scan.close();
  }
}
