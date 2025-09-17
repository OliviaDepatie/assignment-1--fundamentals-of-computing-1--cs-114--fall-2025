import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {
    String message;
    Scanner scan = new Scanner(System.in);

    System.out.println("  OOOO    DDDD");
    System.out.println(" O    O   D   D");
    System.out.println(" O    O   D    D");
    System.out.println(" O    O   D   D");
    System.out.println("  OOOO    DDDD");

    System.out.println("\n Please enter a 5-character string:");

    message = scan.nextLine();

    String trimmedMessage = message.substring(1,message.length()-1);

    StringBuilder stringBuilder = new StringBuilder(trimmedMessage);

    stringBuilder.reverse();

    String reversedMessage = stringBuilder.toString();

    System.out.println("\n Please enter a number in Fahrenheit:");

    double fahrenheit = scan.nextDouble();

    double celsius = (fahrenheit - 32) * 5/9;

    celsius = Math.round(celsius * 10.0) / 10.0;

    System.out.println("\n Random number generated. Continuing...");

    Random random = new Random();
    int min = 32;
    int max = 16384;
    int randomNumber = random.nextInt(max - min + 1) + min;

    System.out.println("\n Your new string is: "
    + celsius + "" + reversedMessage + "" + randomNumber);

  }
}
