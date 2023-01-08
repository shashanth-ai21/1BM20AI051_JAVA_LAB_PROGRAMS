import java.util.Scanner;

public class MultipleCatchExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Enter a number: ");
      int num1 = scanner.nextInt();
      System.out.println("Enter another number: ");
      int num2 = scanner.nextInt();
      int result = num1 / num2;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by 0");
    } catch (NumberFormatException e) {
      System.out.println("Error: Invalid number format");
    } finally {
      System.out.println("Finally block executed");
    }
  }
}
