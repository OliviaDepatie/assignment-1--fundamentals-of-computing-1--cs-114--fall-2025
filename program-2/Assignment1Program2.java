import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    System.out.println("Please enter a base (2-9):");

    Scanner scan = new Scanner(System.in);
    int enteredBase = scan.nextInt();
    int calculatedBaseNumber = (enteredBase * enteredBase * enteredBase * enteredBase) - 1;

    System.out.println("\nThe maximum, 4-digit, base 10 number in " +enteredBase+ " is " +calculatedBaseNumber+ ".");

    System.out.println("Now, enter a base 10 number in the range of 0 to " +calculatedBaseNumber+ " to convert:");

    int enteredBaseTenNumber = scan.nextInt();
    int num1 = enteredBaseTenNumber % enteredBase;
    int quotient1 = enteredBaseTenNumber / enteredBase;
    int num2 = quotient1 % enteredBase;
    int quotient2 = quotient1 / enteredBase;
    int num3 = quotient2 % enteredBase;
    int quotient3 = quotient2 / enteredBase;
    int num4 = quotient3 % enteredBase;
    String newCalculatedBaseNumber = "" + num4 + num3 + num2 + num1;

    System.out.println("\n" +enteredBaseTenNumber+ " (base 10) = " +newCalculatedBaseNumber+ " (base " +enteredBase+ ").");
  }
}
