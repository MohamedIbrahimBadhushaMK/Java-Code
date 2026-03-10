// Program to check whether a number is a Prime number or not
// Time Complexity: O(√n), Space Complexity: O(1)
import java.util.Scanner;
public class PrimeChecker  {
  static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Number to check: ");
    if (!scan.hasNextInt()) {
      System.out.println("Please, enter a valid integer value!");
      scan.close();
      return;
    }
    int num = scan.nextInt();
    System.out.println((isPrime(num))? num + " is Prime.": num + " is not Prime.");
    scan.close();
  }
}
